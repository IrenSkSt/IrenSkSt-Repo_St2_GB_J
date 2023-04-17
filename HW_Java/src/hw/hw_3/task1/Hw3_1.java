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

        // sortedArrList(arrayListSortingToMax, 0, arrayList.size() - 1);

        System.out.println(arrayListSortingToMax);

    }

    public static void sortedArrList(ArrayList<Integer> arr, int left, int right) {
        if (right - left < 2)
            System.out.println(right - left < 2); // для проверки
        return;
        int l = left; // left
        int r = right; // right
        int center = right / 2;

        while (l <= r) {
            while (arr.get(l) < center)
                l++;
            while (arr.get(r) > center)
                r--;

            if (l <= r) {
                int temp = arr.get(l);
                arr.set(l, arr.get(r));
                arr.set(r, temp);

            }
        }
        if (l < right)
            sortedArrList(arr, l, right);
        if (left < r)
            sortedArrList(arr, left, r);
        return;
    }

    public static void createRandomIntArrList() {
        int size = (int) (Math.random() * 10 + 2); // от 2-х до 11
        System.out.println("Размер массива: " + size);

        arrayList = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(size));

        }
        // System.out.println(arrayList); // для проверки
    }
}
