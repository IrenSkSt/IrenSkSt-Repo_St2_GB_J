/**Задача 3
 * Min, Max и среднее арифметическое целочисленного списока ArrayList
 */
package hw.hw_3.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Hw3_3 {
    public static ArrayList<Integer> arrLisNew = new ArrayList<>();

    /**
     * int minItem -> minItemArrList
     * int maxItem -> maxItemArrList
     * int averageArr -> averageArrList
     */
    public static void analiseArrList() {

        createRandomIntArrList();

        if (arrLisNew.size() <= 1) {
            System.out.println("Для массива из одного элемента вычисление показателей не имеет смысла.");
        } else {
            calculateMinMaxAvarage();
            // calculateAvarage();
        }

    }

    private static void calculateMinMaxAvarage() {
        int minItem = 0;
        int maxItem = 0;
        int averageArr = 0;

        Iterator<Integer> iterator = arrLisNew.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp < minItem)
                minItem = temp;
            if (temp > maxItem)
                maxItem = temp;
            sum = sum + temp;
        }
        averageArr = sum / arrLisNew.size();

        System.out.println("Min =" + minItem);
        System.out.println("Max =" + maxItem);
        System.out.println("Average =" + averageArr);
    }

    private static void calculateAvarage() {
    }

    public static void createRandomIntArrList() {

        Random random = new Random();
        int sizeArr = (int) (Math.random() * 10 + 1); // от 1 до 10
        for (int i = 0; i < sizeArr; i++) {
            arrLisNew.add(random.nextInt(-10, 11)); // от -10 до 10
        }

        System.out.println(arrLisNew);
    }
}
