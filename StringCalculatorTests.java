import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTests {
    StringCalculator stringCalculator;

    @Before
    public void SetUp() {
        stringCalculator = new StringCalculator();
    }

    @Test(expected = NullPointerException.class)
    public void TestAddWithNullStringThrowsException() {
        stringCalculator.calculate(null);
    }

    @Test
    public void test1() {
        String numbers =  "1,2,3,12";
        int result = stringCalculator.calculate(numbers);
        Assert.assertEquals(18, result);
    }

    @Test
    public void test2() {
        String numbers = "1,2";
        int result = stringCalculator.calculate(numbers);
        Assert.assertEquals(3, result);
    }
}