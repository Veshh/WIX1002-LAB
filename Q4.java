import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Player 1 rolls twice (1 to 6)
        int p1Roll1 = random.nextInt(6) + 1;
        int p1Roll2 = random.nextInt(6) + 1;
        int p1Total = p1Roll1 + p1Roll2;
        
        // Player 2 rolls twice (1 to 6)
        int p2Roll1 = random.nextInt(6) + 1;
        int p2Roll2 = random.nextInt(6) + 1;
        int p2Total = p2Roll1 + p2Roll2;
        
        System.out.println("Player 1 rolled: " + p1Roll1 + " and " + p1Roll2 + " (Total: " + p1Total + ")");
        System.out.println("Player 2 rolled: " + p2Roll1 + " and " + p2Roll2 + " (Total: " + p2Total + ")");
        
        if (p1Total > p2Total) {
            System.out.println("Player 1 wins the game!");
        } else if (p2Total > p1Total) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}