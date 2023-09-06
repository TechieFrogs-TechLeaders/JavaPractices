package Array_Assign;

public class DetermineTwoMatricesAreEqual {
    public static void main(String[] args) {
        int arr[][] = { { 1, 6, 3 }, { 0, 8, 4 }, { 6, 0, 3 } };

        int arr1[][] = { { 1, 6, 3 }, { 0, 8, 4 }, { 6, 0, 3 } };

       int row1 = arr.length;
       int col1 = arr[0].length;

       int row2 = arr1.length;
       int col2 = arr1[0].length;

       int flag = 1;

       if( row1 != row2 || col1 != col2){
        System.out.println("The matrices are not equal");
       }

        for( int i = 0; i < row1; i++ ){
            for( int j = 0; j < col1; j++){
                if( arr[i][j] != arr1[i][j]){
                    flag = 0;
                    break;
                }
            }
        }

        if( flag == 1){
            System.out.println("Both matrices are equal");
        }
        else{
            System.out.println("Both matrices are not equal");
        }
    }
}
