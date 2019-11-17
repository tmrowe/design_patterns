package tmr.design.pattern.strategy.movie.reward;

public class DailyReward implements IRewardStrategy {

    public int getRewardPoints(int daysRented) {
        return daysRented;
    }

}
