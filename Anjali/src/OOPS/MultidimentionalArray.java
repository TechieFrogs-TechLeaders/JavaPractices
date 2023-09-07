package OOPS;

public class MultidimentionalArray {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];

        int[] arr1[] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        int [][]arr2 = {{ 2, 3, 4, 5},{ 6, 7, 8, 9}};

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
 
        System.out.println("The matrix : ");
        for(int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr.length ; j++){
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }

        System.out.println("The matrix of arr1: ");
        for(int i = 0; i < arr1.length; i++ ){
            for(int j = 0; j < arr1.length ; j++){
                System.out.print(arr1[i][j]+" "); 
            }
            System.out.println();
        }   
        
        System.out.println("The matrix of arr2 : ");
        for(int i = 0; i < arr2.length; i++ ){
            for(int j = 0; j < arr2[0].length ; j++){
                System.out.print(arr2[i][j]+" "); 
            }
            System.out.println();
        }
    }
}
