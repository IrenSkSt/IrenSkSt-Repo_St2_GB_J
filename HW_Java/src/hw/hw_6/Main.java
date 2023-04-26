import java.util.HashSet;
import java.util.Set;

/**
 * Задача 1
 * Ноутбук для магазина техники
 */
public class Main {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(Brand.ASUS, Color.BLACK, 4);
        Laptop laptop2 = new Laptop(Brand.ASUS, Color.BLACK, 4);
        Laptop laptop3 = new Laptop(Brand.MAC, Color.RED, 8);
        Laptop laptop4 = new Laptop(Brand.LENOVO, Color.GRAY, 16);

        Set<Laptop> laptopsList = new HashSet<>();
        System.out.println();
    }
}