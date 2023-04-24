/**Задача 2
 * Дан список сотрудников.
 * Найти и вывести повторяющиеся имена и количество повторений.
 * Отсортировать по убыванию популярности.
 */
package hw.hw_5;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hw5_2 {

    public static String fileName = "WorkersNameList.txt"; // Data-in
    public static ArrayList<String> workersNameList = new ArrayList<>();

    private static final Map<String, Integer> NameToCount_Map = new HashMap<>();

    public static void sortListWokers() {
        readDataListWokers(fileName);

        sortFullNamesWokers();

        showSortedFullNames();
    }

    private static void showSortedFullNames() {
        Integer maxCount = Collections.max(NameToCount_Map.values());
        // System.out.println(maxCount); // для проверки
        System.out.println("Количество полных совпадений по Имени и Фамилии в порядке убывания:");
        for (Integer count = maxCount; count > 0; count--) {
            for (var item : NameToCount_Map.entrySet()) {
                if (item.getValue() == count && count > 1)
                    System.out.printf("%s (%d) %n", item.getKey(), item.getValue());
                if (item.getValue() == count && count == 1)
                    System.out.printf("%s %n", item.getKey());
            }

        }

    }

    private static void sortFullNamesWokers() {
        Collections.sort(workersNameList);
        // System.out.println(workersNameList); // для проверки

        int count = 1;
        String fullName = workersNameList.get(0);
        for (int i = 1; i < workersNameList.size(); i++) {

            if (workersNameList.get(i).equals(fullName))
                count++;
            else {
                NameToCount_Map.put(fullName, count);
                count = 1;
                fullName = workersNameList.get(i);
                // System.out.println(fullName); // для проверки
            }

        }
        NameToCount_Map.put(fullName, count);
        // System.out.println(NameToCount_Map); // для проверки
    }

    private static void readDataListWokers(String fileName) {

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                workersNameList.add(scanner.nextLine());
                // System.out.println(scanner.nextLine()); // для проверки

            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ЧЕРНОВИК
        // try {

        // BufferedReader br = new BufferedReader(new InputStreamReader(new
        // FileInputStream(file)));
        // String line;

        // while ((line = br.readLine()) != null) {

        // // do something with line

        // }
        // br.close();

        // } catch (IOException e) {
        // System.out.println("ERROR: unable to read file " + file);
        // e.printStackTrace();
        // }

    }

}
