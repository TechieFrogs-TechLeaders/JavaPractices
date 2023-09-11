package ArraysAssignment;

public class ArrayLeftRotate {   
    public static void main(String[] args) {
        int[] originalArray = {0, 1, 2, 3, 4, 5};
        int positionsToRotate = 3;
        int length = originalArray.length;
        int[] rotatedArray = new int[length];

        for (int i = 0; i < length; i++) {
            int newPosition = (i - positionsToRotate + length) % length;
            rotatedArray[newPosition] = originalArray[i];
        }
        System.out.println("Original Array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nLeft Rotated Array:");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }
}
