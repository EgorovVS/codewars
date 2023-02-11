package tasks_7kyu;

public class Task4 {
    public static void main(String[] args) {
    }

    public static String repeatStr(final int repeat, final String string) {
        String answer = "";
        for (int i = 0; i < repeat; i++) {
            answer+=string;
        }
        return answer;
    }
//    public static String repeatStr(final int repeat, final String string) {
//        return string.repeat(repeat);
//    }
}
