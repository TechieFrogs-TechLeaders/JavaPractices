package Array_Assign;

import java.util.Scanner;

public class PrintElementsPresentInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        
        System.out.println("Enter the elements: ");
        for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The number of elements : "+arr.length);
    sc.close();
        
    }
}
