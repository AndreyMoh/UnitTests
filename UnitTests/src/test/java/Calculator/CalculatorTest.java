package Calculator;

import junit.framework.TestCase;
import org.junit.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {
        calculator = new Calculator();
    }

    @After
    public void afterTest() { calculator = null; }

    @Ignore
    @Test
    public void testGetDivide() throws Exception {
        Assert.assertEquals(20, calculator.getDivide(100, 5));
    }

    @Ignore
    @Test
    public void testGetMultiple() throws Exception {
        Assert.assertEquals(12, calculator.getMultiple(3, 4));
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void divisionWithException() { calculator.getDivide(15, 0); }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

    @Ignore
    @Test(timeout = 5000)
    public void timeStampTest() {
        while (true);
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testZeroFactorial() {
        Assert.assertEquals(1, calculator.factorial(0));
    }

    @Test(expected = ArithmeticException.class)
    public void bigFactorial() {
        calculator.factorial(1234567444);
        System.out.println(calculator.factorial(1234567444));
    }
    @Test(expected = ArithmeticException.class)
    public void negativeNumbFactException() { calculator.factorial(-3); }
}