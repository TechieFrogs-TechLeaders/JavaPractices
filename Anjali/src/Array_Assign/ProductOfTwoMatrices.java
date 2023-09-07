package Array_Assign;

public class ProductOfTwoMatrices {
    public static void main(String[] args) {
        int arr1[][] = {    
            {1, 3, 2},    
            {3, 1, 1},    
            {1, 2, 2}    
         };    


        int arr2[][] = {    
            {2, 1, 1},    
            {1, 0, 1},    
            {1, 3, 1}    
       };    


    int row1 = arr1.length;    
    //int col1 = arr1.length;   

    int row2 = arr2.length;    
    int col2 = arr2[0].length;    

    if( row1 != col2){
        System.out.println("Matrices cannot be multiplied");   
    }
    else{

        int multiple[][] = new int[row1][col2];

        for(int i = 0; i < row1 ; i++){
            for(int j = 0; j < col2 ; j++){
                for(int k = 0; k < row2 ; k++){
                    multiple[i][j] = multiple[i][j]+arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("The multiplied matrix is : ");
        for(int i = 0; i < row1 ; i++){
            for(int j = 0; j < col2 ; j++){
            System.out.print(multiple[i][j]+" ");
        }
        System.out.println();
    }
    }
}
}
