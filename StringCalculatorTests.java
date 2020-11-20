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

}