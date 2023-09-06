package ArraysAssignment;

public class SumOfRowColomn {
    public static void main(String[] args) {
        int rows,cols;
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        rows=a.length;
        cols=a[0].length;

        int sumrow[] =new int[rows];
        int sumcol[] =new int[cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sumrow[i]=sumrow[i]+a[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            System.out.println("sum of "+(i+1)+" row: "+sumrow[i]);
        }
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                sumcol[j]=sumcol[j]+a[i][j];
            }
            
        }
        for(int j=0;j<rows;j++){
            System.out.println("sum of "+(j+1)+" column: "+sumcol[j]);
            }
    }  
}
