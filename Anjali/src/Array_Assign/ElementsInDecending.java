package Array_Assign;

public class ElementsInDecending {
    static void decending(int arr[]){
        int temp = 0;

        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void display(int arr[]){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8};
        
        System.out.println("Array Before Sorting : ");

        display(arr);

        System.out.println("Array After sorting in descending order : ");
        
        decending(arr);
        display(arr);
        
    }
}
