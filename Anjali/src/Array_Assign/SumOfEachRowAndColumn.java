package Array_Assign;

public class SumOfEachRowAndColumn {
    public static void main(String[] args) {
        
    
    int arr[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    int rows = arr.length;
    int col = arr[0].length;

    int rowSum[] = new int[rows];
    int colSum[] = new int[col];
 
    for(int i = 0; i < rows; i++){
        for(int j = 0; j < col; j++){
            rowSum[i] += arr[i][j];
            colSum[j] += arr[i][j];
        }
    }


    System.out.println("The sum of reach row : ");
    for(int i = 0; i < rows; i++){
        System.out.println("Row " + (i + 1) + ": " + rowSum[i]);
    }

    System.out.println("The sum of reach column : ");
    for(int j = 0; j < col; j++){
        System.out.println("column " + (j + 1) + ": " + colSum[j]);
    }
    
    
}
}
