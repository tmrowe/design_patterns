package tmr.design.pattern.strategy.movie.price;

import org.joda.money.Money;

public class NewReleasePrice implements IPriceStrategy {

    public Money getPrice(int daysRented) {
        Money money = Money.parse("USD 0");
        return money.plus(daysRented * 3);
    }

}
