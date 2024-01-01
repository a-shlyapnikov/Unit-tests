package seminars.first.Calculator;

import seminars.first.Calculator.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    public void testCalculateDiscount(){
        Calculator calculator = new Calculator();
        double test1 = calculator.calculatingDiscount(100.0, 10);
        assertThat(test1).isEqualTo(90.0);

        double test2 = calculator.calculatingDiscount(0.0, 20);
        assertThat(test2).isEqualTo(0);

        assertThatThrownBy(() -> calculator.calculatingDiscount(-100.0, 15))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid data");

        assertThatThrownBy(() -> calculator.calculatingDiscount(100.0, -15))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid data");

        assertThatThrownBy(() -> calculator.calculatingDiscount(100.0, 150))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid data");

    }
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.testCalculateDiscount();


        // Примерные решения домашних заданий из 1 лекции:

        // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
        // необходимые проверки для него используя граничные случаи
        // assertThatThrownBy(() ->
        //         seminars.first.Calculator.Calculator.squareRootExtraction(0, 1, -1)
        // ).isInstanceOf(SomeStateException.class);

        // HW1.2: Как будет выглядеть проверка для случая деления на ноль? (с использованием AssertJ)
        // assertThatThrownBy(() ->
        //        seminars.first.Calculator.Calculator.calculation(5, 0, '/')
        // ).isInstanceOf(ArithmeticException.class);

        // HW1.3: Сравните одну и ту же проверку с использованием условий, ассертов, AssertJ
        // в каком случае стандартное сообщение об ошибке будет более информативным?
        // if (0 != seminars.first.Calculator.Calculator.calculation(2, 6, '+')) {
        //     throw new AssertionError("Ошибка в методе");
        // }
        //   assert 0 == seminars.first.Calculator.Calculator.calculation(2, 6, '+');
        //    assertThat(seminars.first.Calculator.Calculator.calculation(2, 6, '+')).isEqualTo(0);
    }
}