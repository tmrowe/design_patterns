package tmr.design.pattern.strategy.movie.price;

import org.joda.money.Money;

/**
 * Classes implementing this interface determine how a tmr.design.pattern.strategy.movie rental should be priced.
 */
public interface IPriceStrategy {

    /**
     * The price to be charged for a single rental of the tmr.design.pattern.strategy.movie this strategy is applied to.
     * @param daysRented The number of days the tmr.design.pattern.strategy.movie is being rented for.
     * @return The total cost of renting the tmr.design.pattern.strategy.movie.
     */
    Money getPrice(int daysRented);

}
