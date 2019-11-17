package tmr.design.pattern.strategy;

import tmr.design.pattern.strategy.movie.Movie;
import tmr.design.pattern.strategy.movie.price.ChildPrice;
import tmr.design.pattern.strategy.movie.price.IPriceStrategy;
import tmr.design.pattern.strategy.movie.reward.IRewardStrategy;
import tmr.design.pattern.strategy.movie.reward.StandardReward;
import org.junit.Assert;
import org.junit.Test;

public class TestStatement {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private static final String TAB_SEPARATOR = "\t";

    @Test
    public void testGenerate() {
        IPriceStrategy pricingStrategy = new ChildPrice();
        IRewardStrategy rewardsStrategy = new StandardReward();
        String movieName = "test tmr.design.pattern.strategy.movie name";
        Movie movie = new Movie(movieName, pricingStrategy, rewardsStrategy);

        int daysRented = 2;
        Rental rental = new Rental(daysRented);
        rental.add(movie);

        String customerName = "test customer";
        Customer customer = new Customer(customerName, rental);

        Statement statement = new Statement(customer);
        String expected = buildExpectedResult(customer);
        String result = statement.generate();

        Assert.assertEquals(expected, result);
    }

    private String buildExpectedResult(Customer customer) {
        StringBuilder builder = new StringBuilder();

        Rental rental = customer.getRental();
        Movie movie = rental.getMovies().get(0);

        builder
            .append("tmr.design.pattern.strategy.Rental record for ")
            .append(customer.getName())
            .append(LINE_SEPARATOR)
            .append(TAB_SEPARATOR)
            .append(movie.getTitle())
            .append(TAB_SEPARATOR)
            .append(movie.getPrice(rental.getDaysRented()).getAmount())
            .append(LINE_SEPARATOR)
            .append("Amount owed is ")
            .append(rental.getCost().getAmount())
            .append(LINE_SEPARATOR)
            .append("You earned ")
            .append(rental.getRewardPoints())
            .append(" frequent renter points");

        return builder.toString();
    }

}


