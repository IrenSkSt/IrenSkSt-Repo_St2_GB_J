package hw.hw_2;

public class Hw2_2 {

    public static String[] studentsList = null;
    public static String[] gradesList = null;
    public static String[] classesList = null;

    public static void getListStudentsGrades() {

        String inStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        inStr = inStr.replaceAll("[\\[{]", "").replaceAll("[\\}]]", "");
        // System.out.println(inStr); // для проверки

        /**
         * 2й вариант:
         */
        // String s = new
        // StringBuffer().append("[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},")
        // .append("{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},")
        // .append("{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]")
        // .toString();
        // System.out.println(s);

        String[] juornal = inStr.split("},"); // Журнал успеваемости

        // для проверки
        // for (String item : juornal) {
        // System.out.println(item);
        // }
        // System.out.println(juornal[0]); // для проверки

        splitJsonStr(juornal);

        System.out.println(studentsList[0]); // для проверки
        System.out.println(gradesList[0]); // для проверки
        System.out.println(classesList[0]); // для проверки

        // ------------------------------Мусорка:
        // jsonStr = "[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
        // {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
        // {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]";
        // // String jsonStr = ValueOf();
        // // .replaceAll("\\[\\]\"", "");

        // String[] inStr = new String();

        // String[] jsonStr = new String[]
        // {"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
        // {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
        // {"фамилия":"Краснов","оценка":"5","предмет":"Физика"};
        // .split(",");
        // .replaceAll("[^a-zA-Z0-9]", " ");
        // ------------------------
        // String jsonStr = new
        // String("[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},"
        // {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
        // {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]".replaceAll("[]\"",
        // "").toString());
        // String jsonInStr = "Bcvbn hjjkkl][pokj]";
        // String[] jsonInStr = ("Bcvbn hjjkkl][pokj]".split("\\["));
        // // jsonInStr.replaceAll("[]", " ");
        // System.out.println(jsonInStr[1]);
        // System.out.println("[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
        // {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
        // {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]".replace("\"", ""));
        // System.out.println(str);

        // String str = jsonInStr.replaceAll("^[", "");
        // // .toString();
        // System.out.println(str);
        // ---------------------------------------

        // StringBuilder builder = new StringBuilder();

    }

    public static void splitJsonStr(String[] inStrings) {
        StringBuilder students = new StringBuilder();
        StringBuilder grades = new StringBuilder();
        StringBuilder lessons = new StringBuilder();

        for (String itemString : inStrings) {

            String student = itemString.split(",")[0].split(":")[1];
            students.append((student.substring(1, student.length() - 1) + " "));
            // System.out.println(student); // для проверки

            String grade = itemString.split(",")[1].split(":")[1];
            grades.append((grade.substring(1, 2) + " "));
            // System.out.println(grade); // для проверки

            String lesson = itemString.split(",")[2].split(":")[1];
            lessons.append((lesson.substring(1, lesson.length() - 1) + " "));
            // System.out.println(lesson); // для проверки

        }
        // System.out.println(students); // для проверки
        // System.out.println(grades); // для проверки
        // System.out.println(lessons); // для проверки

        studentsList = students.toString().split(" ");
        gradesList = grades.toString().split(" ");
        classesList = lessons.toString().split(" ");
    }
}
