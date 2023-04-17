/** Задача 4
 * Определить пересечение массивов и разность
 */
package hw.hw_3.task4;

import java.util.ArrayList;
import java.util.Random;

public class Hw3_4 {

    public static ArrayList<Integer> arrList1 = new ArrayList<>();
    public static ArrayList<Integer> arrList2 = new ArrayList<>();

    public static void compareArrLists() {
        arrList1 = new ArrayList<>(createRandomIntArrLists());
        System.out.println(arrList1);

        arrList2 = new ArrayList<>(createRandomIntArrLists());
        System.out.println(arrList2);

        containsIntoBothArrs();
        differenceBothArrs();
    }

    private static void containsIntoBothArrs() {
        ArrayList<Integer> resultContains = new ArrayList<>();
        // совокупность одинаковых элементов в 2-х массивах

        for (Integer item : arrList1) {

            if (arrList2.contains(item))
                resultContains.add(item);
        }
        if (resultContains.size() == 0) {
            System.out.println("Нет пересечения массивов");
        } else {
            System.out.println("Пересечение 2-х массивов: " + resultContains);
        }

    }

    private static void differenceBothArrs() {
        ArrayList<Integer> resultDifferense = new ArrayList<>();
        // из 2-го массива удаляем элементы, совпадающие с 1-м массивом

        for (Integer item : arrList2) {

            if (arrList1.contains(item) == false)
                resultDifferense.add(item);
        }
        if (resultDifferense.size() == 0) {
            System.out.println("Массивы совпадают");
        } else {
            System.out.println("Разность 2-х массивов: " + resultDifferense);
        }
    }

    private static ArrayList<Integer> createRandomIntArrLists() {
        int size = (int) (Math.random() * 10 + 1); // от 1 до 10

        Random my_random = new Random();

        ArrayList<Integer> arrList = new ArrayList<>();
        while (size > 0) {
            arrList.add(my_random.nextInt(-10, 20)); // от -10 до 20
            size--;
        }
        // System.out.println(arrList); // для проверки
        return arrList;
    }

}
