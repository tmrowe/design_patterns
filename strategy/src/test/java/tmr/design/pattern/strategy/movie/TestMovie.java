package tmr.design.pattern.strategy.movie;

import tmr.design.pattern.strategy.movie.price.IPriceStrategy;
import tmr.design.pattern.strategy.movie.price.NewReleasePrice;
import tmr.design.pattern.strategy.movie.reward.IRewardStrategy;
import tmr.design.pattern.strategy.movie.reward.StandardReward;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TestMovie {

    private static String title = "test title";
    private static IPriceStrategy pricingStrategy = mock(NewReleasePrice.class);
    private static IRewardStrategy rewardPoints = mock(StandardReward.class);

    private static Movie movie = new Movie(title, pricingStrategy, rewardPoints);

    @Test
    public void testConstructor() {
        Assert.assertEquals(title, movie.getTitle());
        Assert.assertEquals(pricingStrategy, movie.getPricingStrategy());
        Assert.assertEquals(rewardPoints, movie.getRewardPoints());
    }

    @Test
    public void testGetPrice() {
        int daysRented = 2;
        movie.getPrice(daysRented);
        verify(pricingStrategy).getPrice(daysRented);
    }

    @Test
    public void testGetRewardPoints() {
        int daysRented = 2;
        movie.getRewardPoints(daysRented);
        verify(rewardPoints).getRewardPoints(daysRented);
    }
}
