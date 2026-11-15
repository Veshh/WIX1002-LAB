import java.util.Scanner;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of employees (N): ");
        int n = scanner.nextInt();

        int[][] workHours = new int[n][7];

        System.out.println("\n%-10s %-35s %-10s".formatted("Employee", "Day 1  2  3  4  5  6  7", "Total"));
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            int total = 0;
            System.out.printf("Emp %-6d | ", (i + 1));
            for (int j = 0; j < 7; j++) {
                // Generate work hours from 1 to 8
                workHours[i][j] = random.nextInt(8) + 1;
                total += workHours[i][j];
                System.out.print(workHours[i][j] + "  ");
            }
            System.out.printf("| %d\n", total);
        }
        
        scanner.close();
    }
}