package Array_Assign;

public class TransposeOfMatrix {
    static void display(int arr[][]){
        for( int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[0].length; j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            { 1, 2, 3},
            { 4, 5, 6},
            { 7, 8, 9}
        };

        int transpose[][] = new int[arr[0].length][arr.length]; 
        for( int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[0].length; j++){
               transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Original Matrix:");
        display(arr);

        System.out.println("Transpose Matrix:");
        display(transpose);
    }
}
