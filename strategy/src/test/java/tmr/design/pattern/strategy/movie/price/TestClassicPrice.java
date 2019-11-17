package tmr.design.pattern.strategy.movie.price;

import org.joda.money.Money;
import org.junit.Assert;
import org.junit.Test;

public class TestClassicPrice {

    @Test
    public void testGetPrice() {
        ClassicPrice pricing = new ClassicPrice();

        Assert.assertEquals(
                Money.parse("USD 1"),
                pricing.getPrice(1)
        );

        Assert.assertEquals(
                Money.parse("USD 2"),
                pricing.getPrice(2)
        );

        Assert.assertEquals(
                Money.parse("USD 3"),
                pricing.getPrice(3)
        );
    }

}
