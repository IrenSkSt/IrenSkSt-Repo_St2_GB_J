/**Задача 3
 * Простой калькулятор (простые вычисления):
 * операция (+ или - или * или /) между 2-мя числами */

package hw.hw_1.task3;

public class Hw1_3_0 {

    public static void startCalculator() {
        double[] numbers = new double[2];
        // пока калькулятор работает только с 2-мя числами

        char[] operators = new char[] { '=' };
        // пока калькулятор работает только с 1 операцией

        boolean[] flag_err = new boolean[] { true };

        Hw1_3_1.inputAndCheckData(numbers, operators, flag_err);
        // System.out.println(numbers[0]); // для проверки
        // System.out.println(numbers[1]); // для проверки
        // System.out.println(flag_err[0]); // для проверки

        // Hw1_3_2.inputAndCheckOperator(operators);
        // System.out.println(operators[0]); // для проверки

        // Hw1_3_1.inputAndCheckNum(2, numbers);
        // System.out.println(numbers[1]); // для проверки

        Hw1_3_3.calculate(numbers, operators, flag_err);
    }

}
