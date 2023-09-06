package ArraysAssignment;

public class OddEvenNumbersFromArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4, 9, 6, 8, 3};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nOdd Numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nEven Numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}   

