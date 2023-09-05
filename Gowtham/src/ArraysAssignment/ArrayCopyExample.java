package ArraysAssignment;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] SecondArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            SecondArray[i] = arr[i];
        }
        System.out.println("Elements in the SecondArray are :");
        for (int i = 0; i < SecondArray.length; i++) {
            System.out.print(SecondArray[i] + " ");
        }
    }
}




