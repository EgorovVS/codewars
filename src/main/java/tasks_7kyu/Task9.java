package tasks_7kyu;

import java.util.Locale;

//Check to see if a string has the same amount of 'x's and 'o's.
//The method must return a boolean and be case insensitive. The string can contain any char.
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getXO("xox"));
    }

    public static boolean getXO(String str) {
        int xCount = 0;
        int oCount = 0;
        String[] strings = str.split("");
        for (String s: strings
             ) {
            if (s.toLowerCase(Locale.ROOT).equals("o")) {
                oCount++;
            } else if (s.toLowerCase(Locale.ROOT).equals("x")) {
                xCount++;
            }
        }
        return xCount==oCount? true: false;
    }
}
//    public static boolean getXO (String str) {
//        str = str.toLowerCase();
//        return str.replace("o","").length() == str.replace("x","").length();