package tasks_8kyu;
//Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or non-integer.
// If the array does not contain any numbers then you should return 0.

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        double[] numbers = {1, -2.0, 7.5};
        System.out.println(sum(numbers));
    }
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}

