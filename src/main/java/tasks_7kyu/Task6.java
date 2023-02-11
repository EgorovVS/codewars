package tasks_7kyu;
//Complete the square sum function so that it squares each number passed into it and then sums the results together.
public class Task6 {
    public static void main(String[] args) {

    }

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int dig : n
        ) {
            dig = (int) Math.pow(dig, 2);
            sum += dig;
        }
        return sum;
    }
}
