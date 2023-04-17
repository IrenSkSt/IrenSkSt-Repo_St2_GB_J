/**Задача 3
 * Min, Max и среднее арифметическое целочисленного списока ArrayList
 */
package hw.hw_3.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Hw3_3 {
    public static ArrayList<Integer> arrLisNew = new ArrayList<>();

    public static void analiseArrList() {

        createRandomIntArrList();

        if (arrLisNew.size() <= 1) {
            System.out.println("Для массива из одного элемента вычисление показателей не имеет смысла.");
        } else {
            calculateMinMaxAvarage();

        }

    }

    /**
     * int minItem -> minItemArrList
     * int maxItem -> maxItemArrList
     * int averageArr -> averageArrList
     */
    private static void calculateMinMaxAvarage() {
        int minItem = 0;
        int maxItem = 0;
        double averageArr = 0;

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
        averageArr = ((double) sum / (double) (arrLisNew.size()));
        // System.out.println(sum); // для проверки

        System.out.println("Min =" + minItem);
        System.out.println("Max =" + maxItem);
        System.out.printf("Average = %.4f\n", averageArr);
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
