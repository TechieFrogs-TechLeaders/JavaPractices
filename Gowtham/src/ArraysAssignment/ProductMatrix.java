package ArraysAssignment;

public class ProductMatrix {
    public static void main(String[] args) {
        int row1,col1,row2,col2;
        int a[][]={
            {1,2,3},
            {3,1,4},
            {6,3,2}
        };
        int b[][]={
            {2,1,1},
            {3,5,6},
            {1,4,1}
        };
        row1=a.length;
        col1=a[0].length;
        row2=b.length;
        col2=b[0].length;

        if(col1!=row2){
            System.out.println("matrices cannot be multiplied");
        }
        else{
            int Product[][]=new int[row1][col2];
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        Product[i][j]=Product[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Product of two matrices:");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    System.out.print(Product[i][j]+" ");
                }
                System.err.println();
            }
        }

    }
}
