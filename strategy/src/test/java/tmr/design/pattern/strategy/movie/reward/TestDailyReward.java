package tmr.design.pattern.strategy.movie.reward;

import org.junit.Assert;
import org.junit.Test;

public class TestDailyReward {

    @Test
    public void testGetRewardPoints() {
        DailyReward reward = new DailyReward();

        Assert.assertEquals(
                1,
                reward.getRewardPoints(1)
        );

        Assert.assertEquals(
                2,
                reward.getRewardPoints(2)
        );

        Assert.assertEquals(
                3,
                reward.getRewardPoints(3)
        );
    }

}
