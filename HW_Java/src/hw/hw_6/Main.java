import java.lang.Character.Subset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
        Laptop laptop5 = new Laptop(Brand.LENOVO, Color.GRAY, 8);

        Set<Laptop> laptopsList = new HashSet<>();
        laptopsList.add(laptop1);
        laptopsList.add(laptop2);
        laptopsList.add(laptop3);
        laptopsList.add(laptop4);
        laptopsList.add(laptop4);
        laptopsList.add(laptop5);

        // System.out.println("result: " + laptop1.equals(laptop2)); // для проверки
        // System.out.println(laptop1 == laptop2); // для проверки

        System.out.println("Модельный ряд ноутбуков: ");
        System.out.println(laptopsList);

        Map<Integer, Laptop> laptops = new HashMap<>();
        int k = 1;
        for (Laptop laptop : laptopsList) {
            laptops.put(k, laptop);
            k++;
        }

        // System.out.println(laptops); // для проверки
        // System.out.println(laptops.get(1).brand); // для проверки

        Set<Integer> listRam = new TreeSet<>();
        // перечень значений параметра в имеющемся модельном ряду Ноутбуков
        for (var item : laptops.entrySet()) {
            listRam.add(item.getValue().ram);
        }
        System.out.println(listRam); // для проверки

        // // -----------ВАРИАНТ 1 решения вывода пользователю по фильтру
        // // ПРОСТЕЙШИЙ вариант вывода по фильтру:
        // String filterBrand = "ASUS";
        // System.out.printf("Вывод по фильтру %s: %n", filterBrand);
        // for (int i = 1; i < laptops.size() + 1; i++) {
        // String temp = laptops.get(i).brand.toString();
        // // System.out.println(temp); // для проверки
        // if (temp.equals(filterBrand)) {
        // System.out.println(" " + laptops.get(i));
        // }
        // }
        // // другой параметр фильтрации
        // Integer filterRAM = 8;
        // System.out.printf("Вывод по фильтру RAM не менее %d Гб: %n", filterRAM);
        // for (int i = 1; i < laptops.size() + 1; i++) {
        // Integer temp = laptops.get(i).ram;
        // // System.out.println(temp); // для проверки
        // if (temp >= filterRAM) {
        // System.out.println(" " + laptops.get(i));
        // }
        // }
        // // а можно объединить в одном фильтре все признаки
    }
}