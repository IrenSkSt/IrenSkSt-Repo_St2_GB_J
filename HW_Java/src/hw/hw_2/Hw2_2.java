package hw.hw_2;

import java.lang.reflect.Array;

public class Hw2_2 {
    public static void getListStudentsGrades() {
                
        String[] jsonStr = new String[] {"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"};
        // .split(",");
        // .replaceAll("[^a-zA-Z0-9]", " ");

        String[] studentsList = null;
        String[] gradesList = null;
        String[] classesList = null;

        splitJsonStr(jsonStr);

        StringBuilder builder=new StringBuilder();
        
    }

    public static void splitJsonStr(String strIn) {
        split(strIn);
    }
}
