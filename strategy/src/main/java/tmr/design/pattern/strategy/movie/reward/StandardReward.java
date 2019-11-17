package tmr.design.pattern.strategy.movie.reward;

public class StandardReward implements IRewardStrategy {

    public int getRewardPoints(int daysRented) {
        return 1;
    }

}
