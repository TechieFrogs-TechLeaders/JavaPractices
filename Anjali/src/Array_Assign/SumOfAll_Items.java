package Array_Assign;

public class SumOfAll_Items {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5};

        int sum = 0;
        for(int i = 0; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of all Items : "+sum);
    }
}
