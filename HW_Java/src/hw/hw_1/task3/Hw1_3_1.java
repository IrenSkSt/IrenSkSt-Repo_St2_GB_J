package hw.hw_1.task3;

import java.util.Scanner;

public class Hw1_3_1 {
    public static void inputAndCheckData(double[] numbers, char[] operators, boolean[] flag_err) {
        int j = 0;
        int i = 1;

        Scanner inScanner = new Scanner(System.in);
        // допущение в учебных целях: пользователь вводит все правильно
        // проверки введенных данных:
        System.out.printf("Выберите знак для вычислений (+ - * /): ");
        String sing = inScanner.nextLine();
        if (sing.length() > 0) {
            char operator = sing.charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                operators[j] = sing.charAt(0);
            } else {
                System.out.println("Вы ввели некорректно знак вычислений.");
                flag_err[j] = false;
            }
        }
        // Hw1_3_2.CheckOperator(sing);
        // System.out.println(sing); // для проверки

        // do {
        // System.out.printf("Укажите %d число: ", i);
        // boolean flag = inScanner.hasNextDouble();
        // if (flag == false) {
        // System.out.println("The data is incorrect, please try again.");

        // } else {
        // numbers[i - 1] = inScanner.nextDouble();

        // }

        // i++;
        // } while (i <= 2); // пока калькулятор работает только с 2-мя числами

        // пока калькулятор работает только с 2-мя числами
        while (flag_err[j] && i <= 2) {
            System.out.printf("Укажите %d число: ", i);
            boolean flag = inScanner.hasNextDouble();
            if (flag == false) {
                System.out.println("The data is incorrect, please try again.");
                flag_err[j] = false;
            } else {
                numbers[i - 1] = inScanner.nextDouble();
            }

            i++;
        }
        inScanner.close();

    }
}
