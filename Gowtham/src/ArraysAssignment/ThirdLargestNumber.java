package ArraysAssignment;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 45, 66, 7, 32, 19, 53, 9};
        if (arr.length < 3) {
            System.out.println("The array doesn't have at least 3 elements.");
            return;
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num != secondLargest) {
                thirdLargest = num;
            }
        }
        System.out.println("The 3rd largest number in the array is: " + thirdLargest);
    }
}   

