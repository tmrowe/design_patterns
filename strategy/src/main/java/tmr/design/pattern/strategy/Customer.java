package tmr.design.pattern.strategy;

/**
 * This class represents a single customer of the rental service.
 *
 * Each customer object holds a {@link Rental} object representing the movies they have rented.
 *
 * The {@link Statement} object handles reporting the customer current rentals.
 */
class Customer {

    private String name;
    private Rental rental;
    private Statement statement;

    Customer(String name, Rental rental) {
        this.name = name;
        this.rental = rental;
        this.statement = new Statement(this);
    }

    String generateStatement() {
        return statement.generate();
    }

    String getName() {
        return name;
    }

    Rental getRental() {
        return rental;
    }

    void setStatement(Statement statement) {
        this.statement = statement;
    }

}
