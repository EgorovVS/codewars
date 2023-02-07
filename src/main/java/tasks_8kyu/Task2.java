package tasks_8kyu;
//Написать функцию, которая удалит первый и последний символ строки
public class Task2 {
    public static void main(String[] args) {
    String str = "Space";
        System.out.println(remove(str));
    }

    public static String remove(String str) {
        int n = str.length();
        String newStr = str.substring(1,n-1);
        return newStr;
    }
}

