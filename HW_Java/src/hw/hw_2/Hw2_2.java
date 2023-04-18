package hw.hw_2;

public class Hw2_2 {
    public static void getListStudentsGrades() {
        String inStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        inStr = inStr.replaceAll("[\\[{]", "").replaceAll("[\\}]]", "");
        System.out.println(inStr); // для проверки

        // 2й вариант:
        // String s = new
        // StringBuffer().append("[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},")
        // .append("{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},")
        // .append("{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]")
        // .toString();
        // System.out.println(s);

        String[] juornalStr = inStr.split("},");

        for (String item : juornalStr) {
            System.out.println(item);
        }
        // System.out.println(juornalStr[1]); // для проверки

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
        String[] jsonInStr = ("Bcvbn hjjkkl][pokj]".split("\\["));
        // jsonInStr.replaceAll("[]", " ");
        System.out.println(jsonInStr[1]);
        // System.out.println("[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
        // {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
        // {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]".replace("\"", ""));
        // System.out.println(str);

        // String str = jsonInStr.replaceAll("^[", "");
        // // .toString();
        // System.out.println(str);

        // String[] studentsList = null;
        // String[] gradesList = null;
        // String[] classesList = null;

        // splitJsonStr(jsonStr);

        // StringBuilder builder = new StringBuilder();

    }

    /**
     * 
     */
    public static void splitJsonStr() {
        // split(strIn);
    }
}
