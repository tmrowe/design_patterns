package tmr.design.pattern.strategy.movie.price;

import org.joda.money.Money;

public class ChildPrice implements IPriceStrategy {

    private Money BASE_PRICE = Money.parse("USD 1.5");

    public Money getPrice(int daysRented) {
        if (daysRented > 3) {
            return BASE_PRICE.plus((daysRented - 3) * 1.5);
        }
        return BASE_PRICE;
    }
}
