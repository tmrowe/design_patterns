package tmr.design.pattern.strategy.movie.price;

import org.joda.money.Money;
import org.junit.Assert;
import org.junit.Test;

public class TestNewReleasePrice {

    @Test
    public void testGetPrice() {
        NewReleasePrice pricing = new NewReleasePrice();
        Money result = pricing.getPrice(1);
        Money expected = Money.parse("USD 3");
        Assert.assertEquals(expected, result);
    }
}
