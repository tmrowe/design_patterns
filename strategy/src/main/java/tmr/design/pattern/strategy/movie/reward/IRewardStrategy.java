package tmr.design.pattern.strategy.movie.reward;

/**
 * Classes implementing this interface determine additional rewards for the customer.
 */
public interface IRewardStrategy {

    /**
     * The number of reward points earned for a single rental of the tmr.design.pattern.strategy.movie this strategy is applied to.
     * @param daysRented The number of days the tmr.design.pattern.strategy.movie has been rented for.
     * @return The total number of reward points the customer has earned by renting a tmr.design.pattern.strategy.movie.
     */
    int getRewardPoints(int daysRented);

}
