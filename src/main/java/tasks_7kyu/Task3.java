package tasks_7kyu;

//Given an array of integers.
//Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
//If the input is an empty array or is null, return an empty array.

public class Task3 {
    public static void main(String[] args) {
        int[] n = countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 0, -1, -2, -3});
        for (int i : n
        ) {
            System.out.println(i);
        }
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int posCount = 0;
        int negSum = 0;
        int[] emptyarray = {};
        if(input == null) return emptyarray;
        if (input.length <= 0) return emptyarray;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) posCount++;
            else if (input[i] < 0) negSum += input[i];
        }
        int[] output = {posCount, negSum};
        return output;

    }
}
