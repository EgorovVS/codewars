package tasks_7kyu;

//Sentence Smash
//Write a function that takes an array of words and smashes them together into a sentence and returns the
//sentence. You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
//Be careful, there shouldn't be a space at the beginning or the end of the sentence!
public class Task14 {
    public static void main(String[] args) {
    String[] str = {"This","is","the","end"};
        System.out.println(smash(str));
    }
    public static String smash(String[] words) {
        String str = "";
        for (int i = 0; i < words.length; i++) {
            str+=words[i]+" ";
        }
        return str.trim();
    }
}
