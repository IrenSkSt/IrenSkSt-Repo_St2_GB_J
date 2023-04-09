package hw.hw_1.task3;

import java.util.Scanner;

public class Hw1_3_1 {
    public static void inputAndCheckData(double[] numbers, char[] operators) {

        int i = 1;

        Scanner inScanner = new Scanner(System.in);
        // допущение в учебных целях: пользователь вводит все правильно
        // проверки введенных данных:
        System.out.printf("Выберите знак для вычислений (+ - * /): ");
        String sing = inScanner.nextLine();
        if (sing.length() > 0) {
            char operator = sing.charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                operators[i - 1] = sing.charAt(0);
            } else {
                System.out.println("Вы ввели некорректно знак вычислений.");
            }
        }
        // Hw1_3_2.CheckOperator(sing);
        // System.out.println(sing); // для проверки

        do {
            System.out.printf("Укажите %d число: ", i);
            boolean flag = inScanner.hasNextDouble();
            if (flag == false) {
                System.out.println("The data is incorrect, please try again.");

            } else {
                numbers[i - 1] = inScanner.nextDouble();

            }

            i++;
        } while (i <= 2); // пока калькулятор работает только с 2-мя числами

        inScanner.close();

    }
}
