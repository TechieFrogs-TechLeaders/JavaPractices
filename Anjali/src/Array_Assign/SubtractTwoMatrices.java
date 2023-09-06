package Array_Assign;

public class SubtractTwoMatrices {
    public static void main(String[] args) {
        int arr[][] = {{ 1, 2, 3},{ 4, 5, 6},{ 4, 8, 10}};

        int arr1[][] = {{ 7, 8, 9},{ 1, 2, 3},{ 2, 5, 8}};

        int sum[][] = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                sum[i][j] = arr[i][j] - arr1[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
