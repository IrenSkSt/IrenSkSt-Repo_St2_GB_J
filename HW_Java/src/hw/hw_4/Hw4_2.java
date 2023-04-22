/**Задача 2
 * Очередь на основе LinkedList со следующими методами:
    enqueue() — помещает элемент в конец очереди,
    dequeue() — возвращает первый элемент из очереди и удаляет его,
    first() — возвращает первый элемент из очереди, не удаляя.
 */

/* Допущения: началом очереди считаем индекс = 0 */

package hw.hw_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Hw4_2 {
    public static Queue<Integer> queueMy = new LinkedList<>();

    public static void manageQueue() {
        int firstNow;

        System.out.println("Состояние очереди на каждой итерации: ");
        // иммитация наполнения очереди
        int amountPush = (int) (Math.random() * 10) + 3; // от 3 до 12
        for (int i = 0; i < amountPush; i++) {
            addInEndQueue();
        }
        // firstNow = getFirstItem();
        // Иммитация обработки очереди - всегда 1й элемент из очереди
        for (int i = 0; i < queueMy.size() / 2; i++) {
            getFirstItem(); // взяли в работу из очереди
            outFromQueue(); // обработан и ушел из очереди
        }
        // Отчет о состоянии очереди
        if (queueMy.size() == 0) {
            throw new RuntimeException("Сейчас очереди нет.");
        } else {
            System.out.println("Текущее состояние очереди: ");
            firstNow = getFirstItem();
            System.out.println("Всего элементов в очереди = " + queueMy.size());

        }
    }

    private static int getFirstItem() {
        if (queueMy.size() == 0) {
            throw new RuntimeException("Очереди нет.");
        } else {
            System.out.println("1-й в очереди: " + queueMy.peek());
            return queueMy.peek();
        }
    }

    private static void outFromQueue() {
        if (queueMy.size() == 0) {
            throw new RuntimeException("Очереди нет.");
        } else {
            queueMy.remove();
            System.out.println(queueMy);
        }
    }

    public static void addInEndQueue() {

        Random random = new Random();

        queueMy.add(random.nextInt(1, 20)); // от 1 до 20

        System.out.println(queueMy);

        // System.out.println(queueMy);
    }
}
