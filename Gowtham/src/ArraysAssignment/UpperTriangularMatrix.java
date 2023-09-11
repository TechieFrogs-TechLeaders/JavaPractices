package ArraysAssignment;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        int rows,cols;
        int a[][] = {
            {1, 2, 3},
            {6, 4, 5},
            {7, 8, 6}
        };

        rows=a.length;
        cols=a[0].length;
    
        if(rows!=cols){
            System.out.println("matrix should be a square matrix");
          }
          else{
            System.out.println("Upper Triangular Matrix:");
            for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                if (i <= j) {
                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); 
        }
    }
}
}
      