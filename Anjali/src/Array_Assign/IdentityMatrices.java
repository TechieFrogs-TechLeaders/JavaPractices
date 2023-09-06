package Array_Assign;

public class IdentityMatrices {
    public static boolean is_Matrix(int[][] arr){
    int rows = arr.length;
    int cols = arr[0].length;

        if( rows != cols){
            return false;
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if( i == j && arr[i][j] != 1){
                    return false;
                }
                else if( i != j && arr[i][j] !=0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [][] arr= {
            { 1, 0, 0},
            { 0, 1, 0},
            { 0, 0, 0}
        };

        if(is_Matrix(arr)){
            System.out.println("The given matrix is an identity matrix.");
        } else {
            System.out.println("The given matrix is not an identity matrix.");
        }
        
    }
}
