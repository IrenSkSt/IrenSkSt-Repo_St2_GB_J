/** Задача 1 - Вычислить n-ое треугольного число (сумма чисел от 1 до n)*/

package hw.hw_1.task1;

public class Hw1_1_1 {
    public static void calculateTriangularNum(int number) {

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        String result = String.format("%d-е треугольное число = %d", number, sum);
        System.out.println(result);

    }

}
