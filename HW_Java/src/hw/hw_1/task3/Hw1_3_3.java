/** Задача 1 - Вычислить n-ое треугольного число (сумма чисел от 1 до n)*/

package hw.hw_1.task3;

public class Hw1_3_3 {
    public static void calculate(double[] numbers, char[] operators, boolean[] flag_err) {
        // без использования конструкции switch-case
        int i = 0;
        double result = 0;
        if (operators[i] == '=' || flag_err[i] == false) {
            System.out.println("Error");
        } else {
            if (operators[i] == '+')
                result = numbers[i] + numbers[i + 1];
            if (operators[i] == '-')
                result = numbers[i] - numbers[i + 1];
            if (operators[i] == '*')
                result = numbers[i] * numbers[i + 1];
            if (operators[i] == '/')
                result = numbers[i] / numbers[i + 1];

            // вывод чисел ограничен 4 знаками после запятой
            // в реальном калькуляторе разрядность тоже ограничена
            // и при превышение показывает е-числа
            System.out.printf("Результат вычислений:\n%.4f %c %.4f = %.4f\n", numbers[i], operators[i], numbers[i + 1],
                    result);

        }

    }

}
