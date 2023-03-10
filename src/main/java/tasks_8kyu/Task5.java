package tasks_8kyu;
//If you can't sleep, just count sheep!!
//        Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
//        Input will always be valid, i.e. no negative integers.
public class Task5 {
    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }

    public static String countingSheep(int num) {
        String answer = "";
        int count = 1;
        while(num!=0){
            answer+=count+" sheep...";
            count++;
            num--;
        }
        return answer;
    }
}
