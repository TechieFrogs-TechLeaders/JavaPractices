package ArraysAssignment;

public class FindLargestElement {
    
    public static void main(String[] args) {
        int[] arr =new int[]{200, 45, 67, 99, 34, 23, 86};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
    }
}
