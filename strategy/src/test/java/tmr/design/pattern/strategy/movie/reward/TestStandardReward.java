package tmr.design.pattern.strategy.movie.reward;

import org.junit.Assert;
import org.junit.Test;

public class TestStandardReward {

    @Test
    public void testGetRewardPoints() {
        StandardReward reward = new StandardReward();
        int result = reward.getRewardPoints(1);
        Assert.assertEquals(1, result);
    }

}
