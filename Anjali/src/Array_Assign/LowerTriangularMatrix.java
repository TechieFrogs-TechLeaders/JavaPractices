package Array_Assign;

//In lower triangular matrix all the elements above main diagnoal are zero 

public class LowerTriangularMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 0, 7},
            {2, 3, 0},
            {4, 5, 6}
        };

        int rows = arr.length;
        int col = arr[0].length;

        if( rows != col ){
            System.out.println("The matrix is not square so cant have a lower triangle");
        }

        /*System.out.println("The lower Triangular matrix is : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                if( i < j){
                    System.out.print("0" +" ");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
                
            }
            System.out.println();
    }
}
}