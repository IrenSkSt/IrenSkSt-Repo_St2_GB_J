/**Задача 1
 * Струткра телефонной книги, созданная с помощью HashMap.
С условием: 1 человек может иметь несколько телефонов.
 */
package hw.hw_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ВАЖНО!!! Реализовано с имитацией пользовательских действий (без
 * пользовательского интерфейса на вход данных)
 */
public class Hw5_1 {

    private static final Map<String, ArrayList<String>> NameToPhone_Map = new HashMap<>();

    private static ArrayList<String> newPphoneNumsList = new ArrayList<>();

    // для имитации заполнения Телефонной книги
    private static ArrayList<String> numsList = new ArrayList<>(
            Arrays.asList("123456", "456123", "456789", "789789", "123123", "789000"));
    private static ArrayList<String> namesList = new ArrayList<>(
            Arrays.asList("Алексеев", "Яковлев", "стилист", "массаж"));

    public static void createNameToPhoneList() {

        // Имитация записи новых контактов
        for (int i = 0; i < namesList.size(); i++) {
            writeNewContact(i);
        }
        showPhoneBook();

        // Имитация изменения текущего контакта
        String name = "Алексеев";
        addPhoneInContact(name, 4);
        // showPhoneBook(); // для проверки

        name = "стилист";
        renameContact(name, "стилист Вера");
        // showPhoneBook(); // для проверки

        // Имитация поиска контакта
        name = "массаж";
        showContact(name);

        // Имитация удаления контакта
        name = "массаж";
        deleteContact(name);
        // showContact(name); // для проверки

        showPhoneBook();
    }

    private static void renameContact(String name, String newName) {
        if (NameToPhone_Map.containsKey(name)) {
            newPphoneNumsList.addAll(NameToPhone_Map.get(name));
            NameToPhone_Map.put(newName, new ArrayList<>(newPphoneNumsList));

            System.out.printf("Вы перименовали контакт %s в %s %s %n", name, newName, NameToPhone_Map.get(newName));
            System.out.println("-------------------");
            deleteContact(name);
        } else {
            throw new RuntimeException("Такого контакта не найдено.");
        }
    }

    private static void deleteContact(String name) {
        if (NameToPhone_Map.containsKey(name)) {
            System.out.println("Вы удалили контакт: " + name);
            System.out.println("-------------------");
            NameToPhone_Map.remove(name);
        } else {
            throw new RuntimeException("Такого контакта не найдено.");
        }
    }

    private static void showContact(String name) {
        if (NameToPhone_Map.containsKey(name)) {
            System.out.println("Вы искали: " + name);
            System.out.printf("%s %s %n", name, NameToPhone_Map.get(name));
            System.out.println("-------------------");
        } else {
            throw new RuntimeException("Такого контакта не найдено.");
        }
    }

    private static void showPhoneBook() {
        System.out.println("Список контактов: ");
        System.out.println(NameToPhone_Map);
        System.out.println();

    }

    private static void addPhoneInContact(String name, int num) {

        if (NameToPhone_Map.containsKey(name)) {
            newPphoneNumsList.addAll(NameToPhone_Map.get(name));
            // newPphoneNumsList.add(numsList.get(2));
            newPphoneNumsList.add(numsList.get(num));
            // System.out.println(newPphoneNumsList); // для проверки
            NameToPhone_Map.put(name, new ArrayList<>(newPphoneNumsList));

            System.out.printf("Вы добавили в контакт %s новый телефон: %s %n", name,
                    NameToPhone_Map.get(name).get(newPphoneNumsList.lastIndexOf(numsList.get(num))));
            System.out.println("-------------------");
            newPphoneNumsList.clear();
            // System.out.println(NameToPhone_Map.get("Алексеев").get(1)); // для проверки
        } else {
            throw new RuntimeException("Такого контакта не найдено.");
        }
    }

    private static void writeNewContact(int i) {

        newPphoneNumsList.add(numsList.get(i));
        NameToPhone_Map.putIfAbsent(namesList.get(i), new ArrayList<>(newPphoneNumsList));
        newPphoneNumsList.clear();

    }

    // ЧЕРНОВИК
    // private static void writeNewContact() {
    // // String temp = numsList.get(0);
    // // System.out.println(temp); // для проверки
    // newPphoneNumsList.add("123456");
    // // newPphoneNumsList.add(numsList.get(0));
    // NameToPhone_Map.put("Алексеев", new ArrayList<>(newPphoneNumsList));
    // newPphoneNumsList.clear();

    // newPphoneNumsList.add("654321");
    // NameToPhone_Map.put("Яковлев", new ArrayList<>(newPphoneNumsList));
    // newPphoneNumsList.clear();

    // newPphoneNumsList.addAll(NameToPhone_Map.get("Алексеев"));
    // // newPphoneNumsList.add(numsList.get(2));
    // newPphoneNumsList.add("123123");
    // // System.out.println(newPphoneNumsList); // для проверки
    // NameToPhone_Map.put("Алексеев", new ArrayList<>(newPphoneNumsList));
    // newPphoneNumsList.clear();

    // System.out.println(NameToPhone_Map.get("Алексеев").get(1));
    // }
}
