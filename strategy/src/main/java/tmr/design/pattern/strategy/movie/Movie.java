package tmr.design.pattern.strategy.movie;

import tmr.design.pattern.strategy.movie.price.IPriceStrategy;
import tmr.design.pattern.strategy.movie.reward.IRewardStrategy;
import org.joda.money.Money;

/**
 * A tmr.design.pattern.strategy.movie is composed of a title, a {@link IPriceStrategy} which determines the cost of renting this tmr.design.pattern.strategy.movie, and a
 * {@link IRewardStrategy} which determines the frequent renter points this tmr.design.pattern.strategy.movie is worth.
 */
public class Movie {

    private String title;
    private IPriceStrategy pricingStrategy;
    private IRewardStrategy rewardPoints;

    public Movie(String title, IPriceStrategy pricingStrategy, IRewardStrategy rewardPoints) {
        this.title = title;
        this.pricingStrategy = pricingStrategy;
        this.rewardPoints = rewardPoints;
    }

    public Money getPrice(int daysRented) {
        return pricingStrategy.getPrice(daysRented);
    }

    public int getRewardPoints(int daysRented) {
        return rewardPoints.getRewardPoints(daysRented);
    }

    public String getTitle() {
        return title;
    }

    IPriceStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public IRewardStrategy getRewardPoints() {
        return rewardPoints;
    }

}
