package ArraysAssignment;

public class IdentityMatrixCheck  {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        boolean isIdentity = isIdentityMatrix(matrix);
        if (isIdentity) {
            System.out.println("The matrix is an Identity Matrix.");
        } else {
            System.out.println("The matrix is not an Identity Matrix.");
        }
    }
    public static boolean isIdentityMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        if (rows != columns) {
            return false;
        }
        else{

            for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j && matrix[i][j] != 1) {
                    return false;
                } else if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        }
        
        return true;
    }
} 

