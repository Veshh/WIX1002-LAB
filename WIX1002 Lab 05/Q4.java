public class Q4 {
    public static void main(String[] args) {
        int[][] matrix = {
            {9, 3, 6},
            {2, 5, 0},
            {7, 8, 7}
        };

        System.out.println("3 by 3 Matrix");
        printMatrix(matrix);

        int[][] rotated = new int[3][3];
        // Rotate 90 degrees clockwise logic: newCol = 2 - oldRow, newRow = oldCol
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rotated[j][2 - i] = matrix[i][j];
            }
        }

        System.out.println("After rotates 90 degrees clockwise");
        printMatrix(rotated);
    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}