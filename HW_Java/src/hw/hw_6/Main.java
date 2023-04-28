import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.Spring;

/**
 * Задача 1
 * Ноутбук для магазина техники
 */
public class Main {

    // public static Map<String, ArrayList<String>> filters_Map = new HashMap<>();

    // Набор фильтров
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(Brand.ASUS, Color.BLACK, 4);
        Laptop laptop2 = new Laptop(Brand.ASUS, Color.BLACK, 4);
        Laptop laptop3 = new Laptop(Brand.MAC, Color.RED, 8);
        Laptop laptop4 = new Laptop(Brand.LENOVO, Color.GRAY, 16);
        Laptop laptop5 = new Laptop(Brand.LENOVO, Color.GRAY, 8);

        Set<Laptop> laptopsList = new HashSet<>();
        // Администраторы добавили в каталог (Список подгрузки в Каталог Ноутбуков)
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
        // Ккаталог ноутбуков
        int k = 1;
        for (Laptop laptop : laptopsList) {
            laptops.put(k, laptop);
            k++;
        }

        // System.out.println(laptops); // для проверки
        // System.out.println(laptops.get(1).brand); // для проверки

        // ------------Формирование ФИЛЬТРОВ----------------------------
        Map<String, ArrayList<String>> filters_Map = new HashMap<>();
        // Набор фильтров

        Set<Integer> listRam = new TreeSet<>();
        // перечень значений параметра в имеющемся в модельном ряду Ноутбуков
        for (var item : laptops.entrySet()) {
            listRam.add(item.getValue().ram);
        }
        // System.out.println(listRam); // для проверки

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

        System.out.println(filters_Map); // для проверки
        System.out.println();
        // _________________________________________________________________

        // ---------Получить фильтры от юзера----------------------------------
        // Map<String, ArrayList<String>> filters_User = new HashMap<>(filters_Map);
        // для нескольких фильтров одновременно - не сднлано

        Map<String, ArrayList<String>> filters_User = new HashMap<>();
        System.out.println("Выберите фильтр: ");
        System.out.println("  0 = Показать всё");
        int n = 1;
        String[] arr = new String[filters_Map.size()];
        for (var item : filters_Map.entrySet()) {
            arr[n - 1] = item.getKey().toString();
            System.out.printf("  %d = %s %n", n, item.getKey());
            n++;
        }
        System.out.println(arr[1]); // для проверки

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Укажите номер соотвествующего фильтра: ");
        boolean flag = iScanner.hasNextInt();
        int answerKey = iScanner.nextInt();
        // System.out.println(answerKey); // для проверки

        // System.out.println(answerKey == 1);
        if (answerKey == 0 || answerKey != 1 || answerKey != 2 || answerKey != 3) {
            filters_User = new HashMap<>(filters_Map);
            System.out.println();
        } else {
            System.out.println("Выберите значение фильтра: ");
            System.out.println("  0 = Показать все");
            n = 1;
            // for (int i = 0; i < arr.length; i++) {
            // if (answerKey == i){
            // for (var item : filters_Map.get(arr[i])) {
            // System.out.printf(" %d = %s %n", n, item);
            // n++;

            // }
            // }
            if (answerKey == 1) {
                // for (var item : filters_Map.get(arr[n - 1])) {
                // System.out.printf(" %d = %s %n", n, item);
                // n++;
                // }
            }
            System.out.printf("Укажите номер соотвествующего фильтра: ");
            boolean flag1 = iScanner.hasNextInt();
            int answerV = iScanner.nextInt();
        }

        iScanner.close();

        // System.out.println(filters_User); // для проверки
        // FiltersGetFromUsers.createUserFilters();

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