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
        filters_Map.put("ram", new ArrayList<String>(typeRam));

        System.out.println(filters_Map); // для проверки
        System.out.println();
        // _________________________________________________________________

        // ---------Получить фильтры от юзера----------------------------------
        // Map<String, ArrayList<String>> filters_User = new HashMap<>(filters_Map);
        // для нескольких фильтров одновременно - НЕ СДЕЛАНО пока

        Map<String, String> filters_User = new HashMap<>();
        System.out.println("Выберите фильтр: ");
        System.out.println("  0 = Показать всё");
        String keyFilter = "";
        String valueFilter = "";
        int n = 1;
        String[] arrKey = new String[filters_Map.size()];
        for (var item : filters_Map.entrySet()) {
            arrKey[n - 1] = item.getKey().toString();
            System.out.printf("  %d = %s %n", n, item.getKey());
            n++;
        }
        // System.out.println(arrKey[1]); // для проверки

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Укажите номер соотвествующего фильтра: ");
        boolean flag = iScanner.hasNextInt();
        int answerKey;
        if (flag)
            answerKey = iScanner.nextInt();
        else
            answerKey = 0;
        // System.out.println(answerKey); // для проверки

        // ----ЧЕРНОВИК-----------
        // System.out.println(answerKey == 1); // для проверки
        // if (answerKey == 0 || answerKey != 1 || answerKey != 2 || answerKey != 3) {
        // filters_User = new HashMap<>(filters_Map);
        // System.out.println(filters_User);
        // } else {
        // System.out.println("Выберите значение фильтра: ");
        // System.out.println(" 0 = Показать все");
        // n = 1;
        // // for (int i = 0; i < arr.length; i++) {
        // // if (answerKey == i){
        // // for (var item : filters_Map.get(arr[i])) {
        // // System.out.printf(" %d = %s %n", n, item);
        // // n++;

        // // }
        // // }
        // if (answerKey == 1) {
        // // for (var item : filters_Map.get(arr[n - 1])) {
        // // System.out.printf(" %d = %s %n", n, item);
        // // n++;
        // // }
        // }
        // System.out.printf("Укажите номер соотвествующего фильтра: ");
        // boolean flag1 = iScanner.hasNextInt();
        // int answerV = iScanner.nextInt();
        // }
        // ____________________________________________________________
        for (int i = 1; i < arrKey.length + 1; i++) {
            if (answerKey == i) {
                keyFilter = arrKey[i - 1];
                System.out.println(keyFilter); // для проверки

                System.out.printf("Выберите значение фильтра %s: %n", keyFilter);
                System.out.println(" 0 = Показать все");
                n = 1;
                for (var item : filters_Map.get(arrKey[i - 1])) {
                    System.out.printf(" %d = %s %n", n, item);
                    n++;
                }
                System.out.printf("Укажите номер значения фильтра: ");
                // по аналогии = проставить галочки напротив имеющихся значений
                boolean flag1 = iScanner.hasNextInt();
                int answerV;
                if (flag1)
                    answerV = iScanner.nextInt();
                else
                    answerV = 0;
                // System.out.println(answerV); // для проверки
                // System.out.println(n); // для проверки

                for (int j = 1; j < n; j++) {
                    if (answerV == j)
                        valueFilter = filters_Map.get(arrKey[i - 1]).get(answerV - 1);
                    // System.out.println(valueFilter); // для проверки

                    filters_User.put(arrKey[i - 1], valueFilter);
                }

                // System.out.println(filters_User); // для проверки
            }

        }
        iScanner.close();

        // System.out.println(filters_User); // для проверки
        // FiltersGetFromUsers.createUserFilters();

        // _________________________________________________________________

        // ----------------Ответ на запрос юзера по фильтру------------------
        Set<Laptop> listFilterLaptops = new HashSet<>();
        // Итоговый вывод пользователю по фильтру
        if (keyFilter == "" || valueFilter == "") {
            System.out.println("Все Ноутбуки: ");
            for (var item : laptops.entrySet()) {
                listFilterLaptops.add(item.getValue());
                System.out.println(item.getValue());
            }
        } else {
            System.out.println("Ноутбуки по Вашему запросу: ");
            for (Laptop laptop : laptopsList) {

                for (var elem : filters_User.entrySet()) {
                    // System.out.println(laptop.brand.toString() == elem.getValue()); // для
                    // проверки
                    if (elem.getKey() == "Brand" && laptop.brand.toString() == elem.getValue()) {

                        listFilterLaptops.add(laptop);
                        System.out.println(laptop);
                    }
                    if (elem.getKey() == "Color" && laptop.color.toString() == elem.getValue()) {

                        listFilterLaptops.add(laptop);
                        System.out.println(laptop);
                    }
                    // System.out.println(laptop.ram == Integer.parseInt("8")); // для проверки
                    if (elem.getKey() == "ram" && laptop.ram == Integer.parseInt(elem.getValue())) {

                        listFilterLaptops.add(laptop);
                        System.out.println(laptop);
                    }

                    // -----версия свернутая------
                    // if (elem.getKey() == "Brand" && laptop.brand.toString() == elem.getValue()
                    // || elem.getKey() == "Color" && laptop.color.toString() == elem.getValue()
                    // || elem.getKey() == "Ram" && laptop.ram.toString() ==
                    // elem.getValue().toString()) {
                    // // System.out.println(laptop.brand.toString() == elem.getValue()); // для
                    // // проверки
                    // listFilterLaptops.add(laptop);
                    // System.out.println(laptop);
                    // }
                    // ________________________
                }

            }
            if (listFilterLaptops.size() == 0)
                System.out.println("По Вашему запросу ничего не найдено");
            // System.out.println(listFilterLaptops); // для проверки
            System.out.println();
        }

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
