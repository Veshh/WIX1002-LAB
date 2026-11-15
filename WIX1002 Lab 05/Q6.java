import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int rows = scanner.nextInt();

        int[][] pascal = new int[rows][rows];

        // Populate Pascal Triangle values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }

        System.out.println("The Pascal Triangle with " + rows + " row(s)");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.printf("%-4d", pascal[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}