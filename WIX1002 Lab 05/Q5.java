import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] arr = new int[20];

        // Generate 20 random integers from 0 to 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }

        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println();

        // Sort in ascending first using Arrays.sort, then reverse for descending
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Array in descending order");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println();

        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();

        // Linear Search (Descending Array)
        int linearLoops = 0;
        boolean linearFound = false;
        for (int i = 0; i < arr.length; i++) {
            linearLoops++;
            if (arr[i] == target) {
                linearFound = true;
                break;
            }
        }

        if (linearFound) {
            System.out.println(target + " found");
        } else {
            System.out.println(target + " not found");
        }
        System.out.println("Linear Search - " + linearLoops + " loop(s)");

        // Binary Search (Descending Array)
        int binaryLoops = 0;
        int low = 0;
        int high = arr.length - 1;
        boolean binaryFound = false;

        while (low <= high) {
            binaryLoops++;
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                binaryFound = true;
                break;
            } else if (arr[mid] < target) {
                // Since it's descending, smaller elements are to the right
                high = mid - 1;
            } else {
                // Larger elements are to the left
                low = mid + 1;
            }
        }

        if (binaryFound) {
            System.out.println(target + " found");
        } else {
            System.out.println(target + " not found");
        }
        System.out.println("Binary Search - " + binaryLoops + " loop(s)");

        scanner.close();
    }
}