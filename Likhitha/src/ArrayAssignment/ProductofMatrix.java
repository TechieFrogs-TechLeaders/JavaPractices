package ArrayAssignment;

public class ProductofMatrix {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,},{4,5,6},{7,8,9}};
        int b[][] = {{9,8,7},{6,5,4},{3,2,1}};
     int row1 = a.length;
      int col1 = a[0].length;
      int row2 = b.length;
      int col2 = b[0].length;
      if(col1 != row2) {
        System.out.println("Matrices cannot be Multiplied");
      }
      else{
        int prod[][] = new int[row1][col2];
       for(int i=0;i<a.length;i++) {
        for(int j=0;j<b[0].length;j++){
        for(int k=0;k<b.length;k++){
            prod[i][j] = a[i][k]*b[k][j];
        }
    }
}
      
System.out.println("Product of Two Matrices:");
for(int i=0;i<a.length;i++) {
    for(int j=0;j<b[0].length;j++) {
        System.out.print(prod[i][j]+" ");
    }
    System.out.println();
}
      }
    }
}
