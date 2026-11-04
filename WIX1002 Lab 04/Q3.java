import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double sumSq = 0;
        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.print("Enter a score [negative score to quit]: ");
        int score = scanner.nextInt();
        
        while (score >= 0) {
            count++;
            sum += score;
            sumSq += (score * score);

            if (score < min) min = score;
            if (score > max) max = score;

            System.out.print("Enter a score [negative score to quit]: ");
            score = scanner.nextInt();
        }

        if (count > 0) {
            double average = sum / count;
            double variance = (sumSq - (sum * sum) / count) / (count - 1);
            double stdDev = Math.sqrt(variance);

            System.out.println((int)sum);
            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            System.out.printf("Average Score: %.2f\n", average);
            System.out.printf("Standard Deviation: %.2f\n", stdDev);
        } else {
            System.out.println("No scores entered.");
        }
        scanner.close();
    }
}