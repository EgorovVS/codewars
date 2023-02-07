package tasks_8kyu;

//Write a program that finds the summation of every number from 1 to num.
// The number will always be a positive integer greater than 0.
public class Task6 {
    public static void main(String[] args) {
        System.out.println(summation(3));
    }

    public static int summation(int n) {
        if (n == 1) return 1;
        return summation(n - 1) + n;
    }
}
