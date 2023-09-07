package Array_Assign;

import java.util.Scanner;

public class ElementsInOddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];
  
        System.out.println("Enter the array values:");
        for(int i = 0; i < size ; i++ ){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The odd elements:");
        for(int i = 0 ; i < size ; i ++){
            if( i % 2 != 0){
                System.out.println(arr[i]);
            }
            
        }

        sc.close();
    }
}
