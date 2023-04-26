import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
        System.out.println();

        Map<Integer, Laptop> laptops = new HashMap<>();
        // каталог ноутбуков
        int k = 1;
        for (Laptop laptop : laptopsList) {
            laptops.put(k, laptop);
            k++;
        }

        // System.out.println(laptops); // для проверки
        // System.out.println(laptops.get(1).brand); // для проверки

        // ------------Формирование ФИЛЬТРОВ----------------------------
        Set<Integer> listRam = new TreeSet<>();
        // перечень значений параметра в имеющемся модельном ряду Ноутбуков
        for (var item : laptops.entrySet()) {
            listRam.add(item.getValue().ram);
        }
        // System.out.println(listRam); // для проверки

        Map<String, ArrayList<String>> filters_Map = new HashMap<>();
        // Набор фильтров
        ArrayList<String> typeBrands = new ArrayList<>();
        for (Brand en : Brand.values()) {
            typeBrands.add(en.name());
        }
        filters_Map.put("Brand", new ArrayList<String>(typeBrands));

        ArrayList<String> typeColors = new ArrayList<>();
        for (Color en : Color.values()) {
            typeColors.add(en.name());
        }
        filters_Map.put("Color", new ArrayList<String>(typeColors));

        ArrayList<String> typeRam = new ArrayList<>();
        for (Integer num : listRam) {
            typeRam.add(num.toString());
        }
        filters_Map.put("Ram", new ArrayList<String>(typeRam));

        System.out.println(filters_Map);
        System.out.println();
        // _________________________________________________________________

        // ----------------Ответ на запрос юзера по фильтру------------------
        Set<Laptop> listFilterLaptops = new HashSet<>();
        // Итоговый вывод пользователю по фильтру
        System.out.println("Ноутбуки по Вашему запросу: ");
        for (var item : laptops.entrySet()) {
            listFilterLaptops.add(item.getValue());
        }
        System.out.println(listFilterLaptops); // для проверки
        System.out.println();

        // // -----------ВАРИАНТ 1 решения вывода пользователю по фильтру

        // // ПРОСТЕЙШИЙ вариант вывода по фильтру (не прикручен к запросу юзера):
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