import java.util.Random;

public class Q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101); // Random integer within 0 to 100
        System.out.println("Generated n = " + n);

        if (n <= 0) {
            System.out.println("n is 0, no prime numbers to display.");
            return;
        }

        System.out.print("The first " + n + " prime numbers are: ");
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
