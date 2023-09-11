package Array_Assign;

public class PrintLargestElement {
    public static void main(String[] args) {
        int arr[] = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int temp = arr[0];

        for(int i = 0; i < 5 ; i++){
            if(arr[i] > temp){
                temp = arr[i];
            }
                
        }
        System.out.println("Largest Element : "+ temp);
    }
}
