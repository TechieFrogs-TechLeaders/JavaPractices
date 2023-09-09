package ArraysAssignment;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int[][] transposeMatrix = new int[colCount][rowCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < colCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
