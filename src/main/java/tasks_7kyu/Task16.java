package tasks_7kyu;

//Given an array of integers, return a new array with each value doubled.
public class Task16 {
    public static void main(String[] args) {

    }
    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*2;

        }
        return arr;
    }
}
//import java.util.*
//return Arrays.stream(arr).map(x -> x*2).toArray();
