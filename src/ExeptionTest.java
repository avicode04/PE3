import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExeptionTest {
    public static ExeptionHandling exception;
    String message="Avinash";

    @Before
    public void setUp() throws Exception {
        exception = new ExeptionHandling(message);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        exception.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Avinash";
        Assert.assertEquals(message, exception.salutationMessage());
    }
}