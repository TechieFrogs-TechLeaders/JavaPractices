package ArrayAssignment;

public class ArrayDescendingorder {

    private static int i;

    public static void main(String[] args) {
        int temp = 0;
        int arr1[]={66,45,8,9,23,15,87,90,37};
        System.out.println("array before sorting");
        for(int i = 0;i<arr1.length;i++){

        System.out.println(arr1[i]+ " " );
        }
    
    
   // System.out.println(" ");
     for(int i=0;i<arr1.length;i++){
     for(int j=i+1;j<arr1.length;j++){
        if(arr1[i]<arr1[j]){
            temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }
        }
    }
    System.out.println("After sorting Descending Order of an Array");
    for (int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]+ " ");
    }
}
}