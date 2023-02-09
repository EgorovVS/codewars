package tasks_8kyu;

import java.util.Scanner;
//Rock Paper Scissors Let's play! You have to return which player won! In case of a draw return Draw!.
public class Task8 {
    public static void main(String[] args) {
//        System.out.println(rps("rock", "scissors"));
//        System.out.println(rps("paper", "rock"));
        System.out.println(rps("scissors", "paper"));
        System.out.println(rps("paper", "paper"));
    }

    public static String rps(String p1, String p2) {
        int playerOne = 0;
        int playerTwo = 0;
        if (p1 == "rock") playerOne = 1;
        else if (p1 == "paper") playerOne = 2;
        else if (p1 == "scissors") playerOne = 3;
        if (p2 == "rock") playerTwo = 1;
        else if (p2 == "paper") playerTwo = 2;
        else if (p2 == "scissors") playerTwo = 3;
        if (playerOne == 1) {
            switch (playerTwo) {
                case 2:
                    return "Player 2 won!";
                case 3:
                    return "Player 1 won!";
            }
        }
        if (playerOne == 2) {
            switch (playerTwo) {
                case 1:
                    return "Player 1 won!";
                case 3:
                    return "Player 2 won!";
            }
        }
        if (playerOne == 3) {
            switch (playerTwo) {
                case 1:
                    return "Player 2 won!";
                case 2:
                    return "Player 1 won!";

            }
        }
        return "Draw!";
    }
}


//    public static String rps(String p1, String p2) {
//        return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";
//    }
//}