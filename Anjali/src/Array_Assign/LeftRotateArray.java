package Array_Assign;

public class LeftRotateArray {
    public static void main(String[] args) {
        int originalArray[] = {1, 2, 3, 4, 5};
        int rotation = 2;

        //rotation = rotation % originalArray.length;

        int[] rotatedArray = new int[originalArray.length];

        for(int i = 0;i < originalArray.length; i++){
            int newIndex = (i - rotation + originalArray.length) % originalArray.length;

            rotatedArray[newIndex] = originalArray[i];

        }
        System.out.println("Original array");
        display(originalArray);

        System.out.println("rotated array");
        display(rotatedArray);
    }

    static void display(int arr[]){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
