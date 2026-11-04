import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int player1Score = 0;
        int player2Score = 0;
        int turn = 1; // 1 for Player 1, 2 for Player 2

        System.out.println("--- Two Players Dice Game ---");

        while (player1Score <= 100 && player2Score <= 100) {
            int roll = rand.nextInt(6) + 1;

            if (turn == 1) {
                System.out.println("Player 1 rolled: " + roll);
                player1Score += roll;
                System.out.println("Player 1 Total Score: " + player1Score);

                if (roll == 6) {
                    System.out.println("Player 1 rolled a 6! Gets another turn.\n");
                    continue;
                }
                if (player1Score > 100) {
                    System.out.println("\nPlayer 1 wins with " + player1Score + "points!");
                    break;
                }
                turn = 2;
            } else {
                System.out.println("Player 2 rolled: " + roll);
                player2Score += roll;
                System.out.println("Player 2 Total Score: " + player2Score);

                if (roll == 6) {
                    System.out.println("Player 2 rolled a 6! Gets another turn.\n");
                    continue;
                }
                if (player2Score > 100) {
                    System.out.println("\nPlayer 2 wins with " + player2Score + "points!");
                    break;
                }
                turn = 1;
            }
            System.out.println("-------------------------------");
        }

        System.out.println("\n=== GAME OVER ===");
        if (player1Score > player2Score) {
            System.out.println("Player 1 wins with " + player1Score + " points! (Player 2 finished with " + player2Score + ")");

        } else {
            System.out.println("Player 2 wins with " + player2Score + " points! (Player 1 finished with " + player1Score + ")");
        }
    }
}
