package tmr.design.pattern.strategy;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TestCustomer {

    private static String name = "test name";
    private static Rental rental = mock(Rental.class);

    private static Customer customer = new Customer(name, rental);

    @Test
    public void testConstructor() {
        Assert.assertEquals(name, customer.getName());
        Assert.assertEquals(rental, customer.getRental());
    }

    @Test
    public void testGenerateStatement() {
        Statement statement = mock(Statement.class);
        customer.setStatement(statement);
        customer.generateStatement();

        verify(statement).generate();
    }

}
