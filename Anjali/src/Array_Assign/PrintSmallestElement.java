package Array_Assign;

public class PrintSmallestElement {
    public static void main(String[] args) {
        int arr[] = new int[]{ 7, 8, 10, 4, 5};

        int smallest = arr[0];

        for(int i = 0; i < arr.length ; i++){
            if( arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Element: "+smallest);
    }
}
