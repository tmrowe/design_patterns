package tmr.design.pattern.strategy.movie.reward;

public class BonusReward implements IRewardStrategy {

    public int getRewardPoints(int daysRented) {
        if (daysRented > 1) return 2;
        return 1;
    }

}
