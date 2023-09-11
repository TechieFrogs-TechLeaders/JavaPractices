package ArrayAssignment;

public class SparseMatrix {
    public static void main(String[] args) {
        int arr[][] ={
            {1,6,0},
            {0,2,1},
            {0,8,3}
        };
        int count =0;
         int rows = arr.length;
         int colns = arr[0].length;
        int size = rows*colns;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    count++;
                }
            }
        }
        if(count>size/2)
            System.out.println("Given Matrix is a Sparse Matrix");
        else
            System.out.println("Given Matrix is Not a Sparse Matrix");
    }
}

