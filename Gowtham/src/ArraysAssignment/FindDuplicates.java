package ArraysAssignment;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr ;
        arr=new int[]{0, 1, 2, 3, 4, 4, 5, 6, 0, 6, 7, 8 ,9 ,9 };
        System.out.println("Duplicate elements in the array are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
