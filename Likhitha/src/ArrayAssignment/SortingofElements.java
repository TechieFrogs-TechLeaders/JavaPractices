package ArrayAssignment;

public class SortingofElements {
   private static int i;

    public static void main(String[] args) {
     int arr[] = {34,54,-67,23,43,-12};
    System.out.println("Array Elements After Sorting:");
    for(int i=0;i<arr.length;i++) {
        for(int j=i+1;j<arr.length;j++) {
            int temp=0;
            if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println(arr[i]);
    }
    
   // System.out.println();
}
}