package tmr.design.pattern.strategy.movie.price;

import org.joda.money.Money;

public class RegularPrice implements IPriceStrategy {

    private Money BASE_PRICE = Money.parse("USD 2");

    public Money getPrice(int daysRented) {
        if (daysRented > 2) {
            return BASE_PRICE.plus((daysRented - 2) * 1.5);
        }
        return BASE_PRICE;
    }

}
