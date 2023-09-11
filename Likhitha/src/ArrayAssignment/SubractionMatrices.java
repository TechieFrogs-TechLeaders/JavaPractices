package ArrayAssignment;

public class SubractionMatrices {
    public static void main(String[] args){
        int a[][] = {{1,2,3},{4,5,6}};
        int b[][] = {{3,2,1,},{7,4,6}};
        int diff[][] = new int[3][3];
      for(int i=0;i<a.length;i++) {
        for(int j=0;j<a[0].length;j++) {
          diff[i][j]=a[i][j] - b[i][j];  
          System.out.print(diff[i][j]+" ");
        }
        System.out.println();
    }
}
}
  
