package tasks_7kyu;

//You like building blocks. You especially like building blocks that are squares. And what you even like more,
// is to arrange them into a square of square building blocks!
//        However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle!
//        Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait!
//        That's it! You just have to check if your number of building blocks is a perfect square.

public class Task7 {
    public static void main(String[] args) {
        System.out.println(isSquare(3));
        System.out.println(isSquare(4));
    }

    public static boolean isSquare(int n) {
        return n == Math.abs(1)? false : Math.sqrt(n) % 1 == 0;
    }
}
