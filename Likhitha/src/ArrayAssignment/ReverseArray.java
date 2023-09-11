package ArrayAssignment;

public class ReverseArray {
    public static void main(String[] args) {
       int arr1[] = {1,2,3,4,5};
    System.out.println("Original Array");
    for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]+ " ");
    }
       System.out.println("Reverse Array");
    for(int i=arr1.length-1;i>=0;i--){
       System.out.println(arr1[i]+ " ");
    }

    }
}
