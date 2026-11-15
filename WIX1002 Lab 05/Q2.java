import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int count = 0;

        while (count < 10) {
            int num = random.nextInt(21); // Generates 0 to 20
            boolean duplicate = false;

            // Check if number already exists in the array
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                numbers[count] = num;
                count++;
            }
        }

        System.out.print("10 non-duplicate random integers (0-20): ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i == numbers.length - 1 ? "" : ", "));
        }
        System.out.println();
    }
}