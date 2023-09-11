package Oops_practices;

import java.lang.reflect.Array;

public class JaggedArray {
    public static void main(String[] args) {
    int arr[][] = new int [3][];
    int newarr[][] = {{1,2,3},{4,5,6,7}};
   
    for (int i=0;i<newarr.length;i++){
        for(int j = 0;j<newarr[i].length;j++) {
        
            System.out.print(newarr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("New Jagged Array:");
    arr[0] = new int[2];
    arr[1] = new int[3];
    arr[2] = new int[4];
   int count = 0;
   for (int i=0;i<arr.length;i++){
        for(int j = 0;j<arr[i].length;j++) {
           count++;
           arr[i][j] = count;
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
}

    }
}



