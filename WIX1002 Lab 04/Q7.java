import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double P = scanner.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = scanner.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int N = scanner.nextInt();

        double monthlyInterestRate = i / (12 * 100);
        double M = (P * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -N));

        System.out.printf("Monthly Payment: %.2f\n\n", M);
        System.out.printf("%-5s %15s %15s %15s %18s %18s\n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        double totalInterestPaid = 0;
        double unpaidBalance = P;

        for (int n = 1; n <= N; n++) {
            double Cn = M * Math.pow(1 + monthlyInterestRate, -(1 + N - n));
            double Ln = M - Cn;
            totalInterestPaid += Ln;
            unpaidBalance -= Cn;
            if (unpaidBalance < 0) unpaidBalance = 0;

            System.out.printf("%-5d %15.2f %15.2f %15.2f %18.2f %18.2f\n", n, M, Cn, Ln, unpaidBalance, totalInterestPaid);
        }

        scanner.close();
    }
}