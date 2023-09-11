package ArraysAssignment;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 32, 19, 53, 9};
        
        if (arr.length < 2) {
            System.out.println("The array doesn't have at least 2 elements.");
            return;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        System.out.println("The 2nd largest number in the array is: " + secondLargest);
    }
}
   

