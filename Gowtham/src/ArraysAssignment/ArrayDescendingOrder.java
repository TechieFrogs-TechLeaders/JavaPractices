package ArraysAssignment;

public class ArrayDescendingOrder { 
        public static void main(String[] args) {
            int[] arr =new int[]{5, 2, -1, 9, 1, 5, 6, 0, 35, -2};
            int temp;
            int n = arr.length;
    
            System.out.println("Original Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("\nArray in Descending Order:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }   
    
