package hw.hw_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Пузырьковая сортировка числового массива
 * Сортируем от min к max
 */
public class Hw1 {
    public static void sortBoobleArrNum() {

        int[] arrInt = randomArrIntNum();
        // System.out.println(Arrays.toString(arrInt)); // для проверки
        if (arrInt.length != 0) {
            for (int i = 0; i < arrInt.length; i++) {
                for (int j = 0; j < arrInt.length - 1; j++) {
                    if (arrInt[j] > arrInt[j + 1]) {
                        int temp = arrInt[j];
                        arrInt[j] = arrInt[j + 1];
                        arrInt[j + 1] = temp;
                    }
                }
            }
            System.out.println("По возрастанию: " + Arrays.toString(arrInt));
        }
    }

    public static int[] randomArrIntNum() {
        int[] arrNums = new int[0];
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Укажите кол-во элементов массива (от 5 до 20): ");
        // в учебных целях ограничен размер массива
        boolean flag = iScanner.hasNextInt();
        Integer sizeArr = iScanner.nextInt();
        if (flag == false || sizeArr < 5 || sizeArr > 20) {
            System.out.println("Вы указали размер массива некорректно");
        } else {
            arrNums = new int[sizeArr];
            Random random = new Random();
            for (int i = 0; i < sizeArr; i++) {
                arrNums[i] = random.nextInt(-10, 10);

            }
            // System.out.println(sizeArr); // для проверки
            System.out.println("Входящий массив: " + Arrays.toString(arrNums)); // для проверки
        }
        iScanner.close();

        return arrNums;
    }
}