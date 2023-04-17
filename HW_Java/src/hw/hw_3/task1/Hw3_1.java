/** Задача 1
 * Реализовать алгоритм сортировки слиянием
 * от min к max
 */
package hw.hw_3.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hw3_1 {
    public static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void mergeSortArrList() {

        createRandomIntArrList();
        System.out.println(arrayList);

        // сделали сортировку на дублекате, но можно было и сразу входящий сортировать
        ArrayList<Integer> arrayListSortingToMax = new ArrayList<>(arrayList);

        arrayListSortingToMax = new ArrayList<>(sortedArrList(arrayListSortingToMax, 0, arrayList.size() - 1));

        System.out.println(arrayListSortingToMax);

    }

    public static ArrayList<Integer> sortedArrList(ArrayList<Integer> arr, int left, int right) {

        ArrayList<Integer> arrTemp = new ArrayList<>(arr);
        // System.out.println(arrTemp); // для проверки
        int l = left; // left
        int r = right; // right
        int center = right / 2;
        // System.out.println(l);
        // System.out.println(center);
        // System.out.println(r);

        // -----------------------------
        // test для проверки:
        // System.out.println(arrTemp.get(l) < center);
        // if (arrTemp.get(l) < center)
        // l++;
        // else {
        // int temp = arrTemp.get(l);
        // System.out.println(temp);
        // arrTemp.set(l, arrTemp.get(r));
        // arrTemp.set(r, temp);
        // }
        // System.out.println(arrTemp); // для проверки
        // -----------------------------

        while (l <= r) {

            while (arrTemp.get(l) < arrTemp.get(center))
                l++;
            while (arrTemp.get(r) > arrTemp.get(center))
                r--;

            if (l <= r) {
                int temp = arrTemp.get(l);
                arrTemp.set(l, arrTemp.get(r));
                arrTemp.set(r, temp);
                // System.out.println(temp); // для проверки
                l++;
                r--;
            }
        }
        System.out.println(arrTemp); // для проверки

        if (l < right)
            sortedArrList(arrTemp, l, right);
        if (left < r)
            sortedArrList(arrTemp, left, r);

        return arrTemp;
    }

    public static void createRandomIntArrList() {
        int size = (int) (Math.random() * 10 + 2); // от 2-х до 11
        // System.out.println("Размер массива: " + size);

        arrayList = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(size));

        }
        // System.out.println(arrayList); // для проверки
    }
}
