package ArraysAssignment;

public class LowerTriangularMatrix {
    public static void main(String[] args) {
        int rows,cols;
        int a[][]={
            {1,2,3},
            {8,6,4},
            {4,5,6}
          };
          rows=a.length;
          cols=a[0].length;

          if(rows!=cols){
            System.out.println("matrix should be a square matrix");
          }
          else{
            System.out.println("lower triangular matrix");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                if(j>i)
                System.out.print("0 ");
                else
                System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}