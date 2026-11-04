import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        int totalSum = 0;
        int innerSum = 0;

        for (int i = 1; i <= n; i++) {
            innerSum += i;
            totalSum += innerSum;
        }

        System.out.println("The sum of the series is: " + totalSum);
        scanner.close();
    
    }
}
