package tmr.design.pattern.strategy.movie.price;

import org.joda.money.Money;
import org.junit.Assert;
import org.junit.Test;

public class TestChildPrice {

    @Test
    public void testGetPriceDaysRentedLessThan3() {
        ChildPrice pricing = new ChildPrice();
        Money result = pricing.getPrice(0);
        Money expected = Money.parse("USD 1.5");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetPriceDaysRentedGreaterThan3() {
        ChildPrice pricing = new ChildPrice();
        Money result = pricing.getPrice(5);
        Money expected = Money.parse("USD 4.5");
        Assert.assertEquals(expected, result);
    }

}
