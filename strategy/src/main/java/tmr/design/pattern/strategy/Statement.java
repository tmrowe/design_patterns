package tmr.design.pattern.strategy;

import tmr.design.pattern.strategy.movie.Movie;

/**
 * This class produces a printable statement for a customer.
 *
 * Showing the customers name.
 * The name and cost of each of the movies they have rented.
 * The total owed by the customer.
 * The total frequent renter points accrued.
 *
 * Example Output:
 * tmr.design.pattern.strategy.Rental record for tmr.design.pattern.strategy.Customer 1
 *     Movie 1 1.5
 *     Movie 2 1.5
 *     Movie 3 2
 * Amount owed is 5
 * You earned 3 frequent renter points
 */
class Statement {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private static final String TAB_SEPARATOR = "\t";

    private Customer customer;
    private Rental rental;
    private StringBuilder builder;

    Statement(Customer customer) {
        this.customer = customer;
        this.rental = customer.getRental();
        this.builder = new StringBuilder();
    }

    String generate() {
        appendCustomerLine();
        appendMovieLines();
        appendTotalOwed();
        appendRenterPoints();
        return builder.toString();
    }

    private void appendCustomerLine() {
        builder
            .append("tmr.design.pattern.strategy.Rental record for ")
            .append(customer.getName())
            .append(LINE_SEPARATOR);
    }

    private void appendMovieLines() {
        for (Movie movie: rental.getMovies()) {
            builder
                .append(TAB_SEPARATOR)
                .append(movie.getTitle())
                .append(TAB_SEPARATOR)
                .append(movie.getPrice(rental.getDaysRented()).getAmount())
                .append(LINE_SEPARATOR);
        }
    }

    private void appendTotalOwed() {
        builder
            .append("Amount owed is ")
            .append(rental.getCost().getAmount())
            .append(LINE_SEPARATOR);
    }

    private void appendRenterPoints() {
        builder
            .append("You earned " )
            .append(rental.getRewardPoints())
            .append(" frequent renter points");
    }

}