package ArraysAssignment;

public class ArrayRightRotate {   
    public static void main(String[] args) {
        int[] originalArray = {0, 1, 2, 3, 4, 5};
        int positionsToRotate = 2; 
        int length = originalArray.length;
        int[] rotatedArray = new int[length];

        for (int i = 0; i < length; i++) {
            int newPosition = (i + positionsToRotate) % length; 
            rotatedArray[newPosition] = originalArray[i];
        }

        System.out.println("Original Array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nRight Rotated Array:");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }
}
