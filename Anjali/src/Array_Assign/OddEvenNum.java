package Array_Assign;

public class OddEvenNum {
    public static void main(String[] args) {
        int arr[] = new int[]{ 1, 2, 3, 4, 6, 7, 9};
        
        System.out.println("Even numbers in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        
        System.out.println("Odd numbers in array : ");
        for(int i = 0 ; i < arr.length ; i++){

             if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
