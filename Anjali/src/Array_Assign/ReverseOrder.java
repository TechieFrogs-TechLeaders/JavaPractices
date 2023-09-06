package Array_Assign;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] originalOrder = new int[]{1, 2, 3, 4, 5};
        
        System.out.println("Original order:");
        for(int i = 0; i < originalOrder.length; i++){
            System.out.print(originalOrder[i]+" ");
        }
        
        System.out.println();
        System.out.println("Reverse order");
        for(int i = originalOrder.length - 1 ; i >= 0 ; i--){
            System.out.print(originalOrder[i]+" ");
        }
        
    }
}
