package Array_Assign;

public class ElementsInEvenPosition {
    public static void main(String[] args) {
        int arr[] = new int[]{ 1, 2, 3, 4, 5};
        
        System.out.println("Elements in even position : ");
        for(int i = 0; i < arr.length; i++){
            if( i % 2 == 0 ){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
