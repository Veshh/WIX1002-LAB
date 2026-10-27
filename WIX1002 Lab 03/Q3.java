import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the sales volume: ");
        double sales = scanner.nextDouble();
        double commission = 0.0;
        
        if (sales <= 100) {
            commission = sales * 0.05;
        } else if (sales <= 500) {
            commission = sales * 0.075;
        } else if (sales <= 1000) {
            commission = sales * 0.10;
        } else {
            commission = sales * 0.125;
        }
        
        System.out.printf("Total commission: %.2f\n", commission);
        scanner.close();
    }
}