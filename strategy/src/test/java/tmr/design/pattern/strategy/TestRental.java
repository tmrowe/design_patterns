package tmr.design.pattern.strategy;

import tmr.design.pattern.strategy.movie.Movie;
import org.joda.money.Money;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestRental {

    @Test
    public void testConstructor() {
        int daysRented = 2;
        Rental rental = new Rental(daysRented);

        Assert.assertEquals(0, rental.getMovies().size());
        Assert.assertEquals(daysRented, rental.getDaysRented());
        Assert.assertEquals(Money.parse("USD 0"), rental.getCost());
        Assert.assertEquals(0, rental.getRewardPoints());
    }

    @Test
    public void testAdd() {
        int daysRented = 2;
        Rental rental = new Rental(2);

        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);

        when(movie1.getPrice(daysRented)).thenReturn(Money.parse("USD 2"));
        when(movie2.getPrice(daysRented)).thenReturn(Money.parse("USD 2"));

        when(movie1.getRewardPoints(daysRented)).thenReturn(1);
        when(movie2.getRewardPoints(daysRented)).thenReturn(1);

        rental.add(movie1);
        rental.add(movie2);

        Assert.assertThat(rental.getMovies(), contains(movie1, movie2));
        Assert.assertEquals(Money.parse("USD 4"), rental.getCost());
        Assert.assertEquals(2, rental.getRewardPoints());
    }

}
