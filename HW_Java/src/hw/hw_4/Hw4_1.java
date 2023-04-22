/**Задача 1
 * Метод, который вернёет «перевёрнутый» список: LinkedList с несколькими элементами
 */
package hw.hw_4;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Hw4_1 {

    public static final LinkedList<Integer> myLinkedList = new LinkedList<>();

    public static void reverseLinkedList() {

        List<Integer> reverseLL = new LinkedList<>();
        fillRandomIntLinkedList();

        ListIterator<Integer> listIterator = myLinkedList.listIterator(myLinkedList.size());
        while (listIterator.hasPrevious()) {
            reverseLL.add(listIterator.previous());
        }

        System.out.println("В обратном направлении: " + reverseLL);

    }

    public static void fillRandomIntLinkedList() {

        Random random = new Random();
        int sizeList = 5 + (int) (Math.random() * 10); // от 5 до 14
        for (int i = 0; i < sizeList; i++) {
            myLinkedList.add(random.nextInt(-10, 20)); // от -10 до 20
        }

        System.out.println("Исходный LinkedList:    " + myLinkedList);
    }
}
