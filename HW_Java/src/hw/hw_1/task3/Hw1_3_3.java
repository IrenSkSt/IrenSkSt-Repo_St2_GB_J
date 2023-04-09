/** Задача 1 - Вычислить n-ое треугольного число (сумма чисел от 1 до n)*/

package hw.hw_1.task3;

public class Hw1_3_3 {
    public static void calculate(double number1, char operator, double number2) {
        // без использования конструкции switch-case
        double result = 0;
        if (operator == '=') {
            System.out.println("Error");
        } else {
            if (operator == '+')
                result = number1 + number2;
            if (operator == '-')
                result = number1 - number2;
            if (operator == '*')
                result = number1 * number2;
            if (operator == '/')
                result = number1 / number2;

            // вывод чисел ограничен 4 знаками после запятой
            // в реальном калькуляторе разрядность тоже ограничена
            // и при превышение показывает е-числа
            System.out.printf("Результат вычислений:\n%.4f %c %.4f = %.4f\n", number1, operator, number2, result);

        }

    }

}
