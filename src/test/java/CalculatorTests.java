import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import ru.sberhealth.rgs.Calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


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
        assertThat("1 + 1 should be 2", result, equalTo(2));
    }
}
