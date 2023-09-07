package Array_Assign;

import java.util.Arrays;

public class ConcatenateArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int length1 = array1.length;
        int length2 = array2.length;

        int result[] = new int[length1 + length2];
        
        System.arraycopy(array1, 0, result, 0, length1);
        
        System.arraycopy(array2 , 0 , result , length1 , length2);

        System.out.println("Concatenated Array: " + Arrays.toString(result));
    }
}
