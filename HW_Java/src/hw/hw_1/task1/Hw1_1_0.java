package hw.hw_1.task1;

import java.util.Scanner;

public class Hw1_1_0 {
    public static void inputNum() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Укажите натуральное число (не больше 20): ");
        // в учебных целях ограничиваем входные данные, чтобы не грузить комп
        // проверки введенных данных:
        boolean flag = iScanner.hasNextInt();
        if (flag == false) {
            System.out.println("The data is incorrect, please try again.");
        } else {
            Integer number = iScanner.nextInt();
            if (number <= 20) {
                Hw1_1_1.calculateTriangularNum(number);
                Hw1_1_2.calculateFactorialNum(number);
            } else {
                System.out.println("Number > 20, please try again.");
            }
        }
        // System.out.println(number); // для проверки
        iScanner.close();

    }
}
