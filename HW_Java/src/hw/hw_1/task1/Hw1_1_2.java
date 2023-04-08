/** Задача 1 - Вычислить n! (произведение чисел от 1 до n) */

package hw.hw_1.task1;

public class Hw1_1_2 {
    public static void calculateFactorialNum(int number) {

        int mult = 1;
        for (int i = 1; i <= number; i++) {
            mult = mult * i;
        }

        String result = String.format("%d! факториал = %d", number, mult);
        System.out.println(result);

    }

}
