package tasks_7kyu;
//Complete the function that accepts a string parameter, and reverses each word in the string.
// All spaces in the string should be retained.

public class Task8 {
    public static void main(String[] args) {
        System.out.println(reverseWords("The lazy dog"));
    }

    public static String reverseWords(final String original) {
        String[] str = original.split(" ");
        String newStr = "";
        for (int i = 0; i < str.length-1; i++) {
            newStr+= new StringBuilder(str[i]).reverse().toString()+" ";
        }
        newStr+=str[str.length-1];
        return newStr;

    }
}
