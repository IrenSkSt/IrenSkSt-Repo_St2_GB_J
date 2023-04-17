/**Задача 2
 * Удалить чётные числа из произвольный список целых чисел
 */
package hw.hw_3.task2;

import java.util.ArrayList;
import java.util.Random;

public class Hw3_2 {
    public static ArrayList<Integer> arrList = new ArrayList<>();

    public static void findAndDelEvenNum() {

        createRandomIntArrList();
        delEvenNumFromArrList();
        System.out.println(arrList);
    }

    public static void delEvenNumFromArrList() {
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) % 2 == 0) {
                System.out.println("Delete:" + arrList.get(i)); // для проверки
                arrList.remove(i);
                i--;
            }
            // System.out.println(arrList.get(i)); // для проверки
        }

    }

    public static void createRandomIntArrList() {
        final int size = (int) ((Math.random() * 10 + 5)); // от 5 до 14
        System.out.println("Размер массива: " + size);

        arrList = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrList.add(random.nextInt(size * 2 + 10) - 10); // (max - min)+min от -10 до 2*size

        }
        System.out.println(arrList);
    }
}
