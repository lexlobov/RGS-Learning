import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.sberhealth.rgs.Calculator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.Matchers.*;

public class CalculatorTests {

    private Calculator calculator;

    @BeforeEach
    // данный метод будет выполняться перед каждым тестовым методом
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void additionPositiveTest(){
        int result = calculator.addTwoNumbers(1, 1);
        assertThat("1 + 1 should be 2", result, equalTo(2));
    }

    @Test
    // Данный тест упадет, так как результат равен 3, а мы ожидаем увидеть 2, в результате происходит AssertionError, и тест считается не пройденным
    public void additionNegativeTest(){
        int result = calculator.addTwoNumbers(1, 2);
        assertThat("1 + 2 should not to be 2", result, not(2));
    }

    @Test
    public void subtractNumberAFromNumberBPositiveTest(){
        int result = calculator.subtractNumberAFromNumberB(1, 3);
        assertThat("3 - 1 should be 2", result, is(2));
    }

    @Test
    public void subtractNumberAFromNumberBNegativeTest(){
        int result = calculator.subtractNumberAFromNumberB(1, 4);
        assertThat("4 - 1 should not to be 2", result, not(2));
    }

    @Test
    public void multiplyTwoNumbersPositiveTest(){
        int result = calculator.multiplyTwoNumbers(2, 3);
        assertThat("3 * 2 should be 6", result, is(6));
    }

    @Test
    public void multiplyTwoNumbersNegativeTest(){
        int result = calculator.multiplyTwoNumbers(1, 4);
        assertThat("4 * 1 should not to be 6", result, not(6));
    }

    @Test
    public void divideTwoNumbersPositiveTest(){
        int result = calculator.divideTwoNumbers(6, 3);
        assertThat("6 / 3 should be 2", result, is(2));
    }

    @Test
    public void divideTwoNumbersNegativeTest(){
        int result = calculator.divideTwoNumbers(4, 1);
        assertThat("4 / 1 should not to be 6", result, not(2));
    }

}