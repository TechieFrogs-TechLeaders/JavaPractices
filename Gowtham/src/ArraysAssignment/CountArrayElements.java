package ArraysAssignment;

public class CountArrayElements {   
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println("The number of elements in the array is: " + count);
    }
}
