package tasks_7kyu;

//You might know some pretty large perfect squares. But what about the NEXT one?
//Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
//If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.

public class Task12 {
    public static void main(String[] args) {
        System.out.println(findNextSquare(16));
    }

    public static long findNextSquare(long sq) {
//        double temp = Math.sqrt(sq);
//        if(temp % 1 != 0) return -1;
//        return (long)Math.pow(temp+1,2);
        return Math.sqrt(sq) % 1 != 0 ? -1 : (long)Math.pow(Math.sqrt(sq) + 1, 2);
    }
}
