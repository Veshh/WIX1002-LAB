import java.util.Scanner;
import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of students (N): ");
        int n = scanner.nextInt();

        int[] scores = new int[n];
        int sum = 0;

        System.out.print("The scores are: ");
        for (int i = 0; i < n; i++) {
            scores[i] = random.nextInt(101); // Generates 0 to 100
            sum += scores[i];
            System.out.print(scores[i] + (i == n - 1 ? "" : ", "));
        }
        System.out.println();

        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 1; i < n; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) sum / n;

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.printf("Average score: %.2f\n", average);
        
        scanner.close();
    }
}