package tasks_8kyu;

public class Task1 {
    public static void main(String[] args) {
        int[] answer = countBy(2, 5);
        for (int i : answer
        ) {
            System.out.print(i);
        }
    }

    public static int[] countBy(int x, int n) {
        int count = x;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = count;
            count += x;
        }
        return answer;
    }
}

