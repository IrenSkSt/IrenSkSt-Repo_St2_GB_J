/**Задача 1
 * Струткра телефонной книги, созданная с помощью HashMap.
С условием: 1 человек может иметь несколько телефонов.
 */
package hw.hw_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hw5_1 {

    private static final Map<String, ArrayList<String>> NameToPhone_Map = new HashMap<>();

    private static ArrayList<String> newPphoneNumsList = new ArrayList<>();

    // для имитации заполнения Телефонной книги
    private static ArrayList<String> numsList = new ArrayList<>(
            Arrays.asList("123456", "456123", "123123", "456789", "789789"));
    private static ArrayList<String> namesList = new ArrayList<>(
            Arrays.asList("Алексеев", "Яковлев", "стилист", "массаж Вера"));

    public static void createNameToPhoneList() {

        writeNewContact();

        System.out.println(NameToPhone_Map);
    }

    private static void writeNewContact() {

        newPphoneNumsList.add(numsList.get(0));
        NameToPhone_Map.put("Алексеев", new ArrayList<>(newPphoneNumsList));
        newPphoneNumsList.clear();

        newPphoneNumsList.add("654321");
        NameToPhone_Map.put("Яковлев", new ArrayList<>(newPphoneNumsList));
        newPphoneNumsList.clear();

        newPphoneNumsList = NameToPhone_Map.get("Алексеев");
        newPphoneNumsList.add("123123");
        NameToPhone_Map.put("Алексеев", newPphoneNumsList);
        newPphoneNumsList.clear();
    }
}
