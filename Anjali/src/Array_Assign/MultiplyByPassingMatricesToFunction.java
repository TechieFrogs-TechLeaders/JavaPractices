package Array_Assign;

public class MultiplyByPassingMatricesToFunction {
    static int[][] muitiplyMatrices( int matrix1[][] , int[][] matrix2){

        int [][]result = new int[matrix1.length][matrix2[0].length];
        for( int i = 0; i < matrix1.length; i++){
            for( int j = 0; j < matrix2[0].length; j++){
                for( int k = 0; k < matrix2[0].length; k++){
                    result[i][j] = matrix1[i][k] + matrix2[k][j] ;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int matrix1[][] = {
            { 1, 2, 3},
            { 4, 5, 6}
        };

        int matrix2[][] = {
            { 7, 8},
            { 9, 10},
            { 11, 12}
        };

        //int [][]result = new int[matrix1.length][matrix2[0].length];

        //muitiplyMatrices(matrix1,matrix2);

        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrix dimensions are not suitable for multiplication.");
        } else {
            // Perform matrix multiplication
            int[][] result = muitiplyMatrices(matrix1, matrix2);

            // Display the result matrix
            System.out.println("Result Matrix:");
            
            //displayMatrix(result);

            for( int i = 0; i < matrix1.length; i++){
                for( int j = 0; j < matrix2[0].length; j++){
                    System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        
                    
        }
    }


    }
