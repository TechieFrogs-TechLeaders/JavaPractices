package Array_Assign;

public class SparseMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 3 }, { 0, 0, 4 }, { 6, 0, 0 } }; //A matrix is sparse if it has more Zeros

        int rows = arr.length;
        int cols = arr[0].length;

        int count = 0;

        for( int i = 0; i < rows; i++){
            for( int j = 0; j < cols; j++){
                if( arr[i][j] == 0){
                    count++;
                }
            }
        }

        if( count > ( (rows * cols ) / 2 )){  //rows * cols gives us the total num of elements
            System.out.println("The matrix is a Sparse matrix");
        }
        else{
            System.out.println("The matrix is not a sparse matrix");
        }
    }
}
