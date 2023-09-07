package Array_Assign;

public class AddMatricesByMultyDimenArray {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 2, 3},
            {6, 7, 4},
            {1, 8, 2}
        };

        int row = matrix1.length;
        int col = matrix1[0].length;

        int row1 = matrix2.length;
        int col1 = matrix2[0].length;

        if( row != row1 || col != col1){
            System.out.println("The matrices are not equal so cant be added : ");
        }
        else{
            int result[][] = new int[row][col];

            for( int i = 0; i < row; i++){
                for( int j = 0; j < col; j++){
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                   // System.out.print(result[i][j]);
                }
            }

            for( int i = 0; i < row; i++){
                for( int j = 0; j < col; j++){
                   // result[i][j] = matrix1[i][j] + matrix2[i][j];
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

        
    }
}
