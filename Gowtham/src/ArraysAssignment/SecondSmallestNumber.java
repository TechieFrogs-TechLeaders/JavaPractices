package ArraysAssignment;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 32, 19, 53, 9};
        
        if (arr.length < 2) {
            System.out.println("The array doesn't have at least 2 elements.");
            return;
        }

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = num;
            } else if (num < secondSmallest && num != firstSmallest) {
                secondSmallest = num;
            }
        }

        System.out.println("The 2nd smallest number in the array is: " + secondSmallest);
    }
}    
