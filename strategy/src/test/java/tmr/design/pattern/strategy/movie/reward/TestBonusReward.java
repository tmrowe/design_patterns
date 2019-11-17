package tmr.design.pattern.strategy.movie.reward;

import org.junit.Assert;
import org.junit.Test;

public class TestBonusReward {

    @Test
    public void testGetRewardPointsDayRentedLessThan1() {
        BonusReward reward = new BonusReward();
        int result = reward.getRewardPoints(0);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGetRewardPointsDayRentedGreaterThan1() {
        BonusReward reward = new BonusReward();
        int result = reward.getRewardPoints(3);
        Assert.assertEquals(2, result);
    }

}
