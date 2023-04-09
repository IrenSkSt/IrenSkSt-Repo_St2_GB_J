/**Задача 2
 * Вывести все простые числа от 1 до 1000
 */

package hw.hw_1.task2;

public class Hw1_2_0 {
    public static void findSimpleNumbers1to1000() {
        // int[] list_simple_num = new int[] { 2, 3, 5, 7, 11, 13 };
        // исключение =1 (т.к. делится только на себя)
        // вариант 1:
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            if (i == 2 || i == 3)
                System.out.printf("%d ", i);
            if (i > 3) {
                while (flag == true) {
                    // отсев чисел, не относящихся к простым с наибольшей верояьностью, по делителям
                    if (i % 2 == 0 || i % 3 == 0) {
                        flag = false;
                        // System.out.println(i); // для проверки
                        // System.out.println(flag); // для проверки
                    } else {
                        // отсев чисел, не относящихся к простым,
                        // при наличии хоть одного делителя до (квадратного корня из числа) +1
                        for (int j = 3; j <= Math.sqrt(i) + 1; j = j + 2) {
                            if (i % j == 0) {
                                flag = false;
                                // System.out.println(i); // для проверки
                                // System.out.println(j); // для проверки
                                // System.out.println(flag); // для проверки
                            }

                        }
                        if (flag) {
                            System.out.printf("%d ", i);
                            flag = false;
                        }
                    }

                }
            }

        }
        System.out.println("\n");

    }

}
