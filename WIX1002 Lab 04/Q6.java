import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        // Randomly choose how many digits the number will have (between 1 and 9 digits)
        int numDigits = rand.nextInt(9) + 1; 
        
        // Compute the min and max bounds for that number of digits
        long min = (long) Math.pow(10, numDigits - 1);
        long max = (long) Math.pow(10, numDigits);
        
        // Generate a random non-negative integer within that range
        int num = (int)(min + rand.nextDouble() * (max - min));
        
        System.out.println("Generated number: " + num);
        
        // Count the digits using a loop
        int temp = num;
        int digits = 0;
        
        if (num == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
        }
        
        System.out.println("Number of digits: " + digits);
    }
}