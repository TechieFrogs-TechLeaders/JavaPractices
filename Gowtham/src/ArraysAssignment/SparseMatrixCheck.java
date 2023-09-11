package ArraysAssignment;

public class SparseMatrixCheck {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 7, 0},
            {0, 7, 0},
            {7, 7, 0}
        };

        boolean isSparse = isSparseMatrix(matrix);

        if (isSparse) {
            System.out.println("The matrix is a Sparse Matrix.");
        } else {
            System.out.println("The matrix is not a Sparse Matrix.");
        }
    }
    public static boolean isSparseMatrix(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int zeroCount = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }
        return zeroCount > (rowCount * colCount) / 2;
    }
}
