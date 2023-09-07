package Array_Assign;

public class ArrayCopyElements {
    public static void main(String[] args) {
        int[] sourceArray = new int[5];

        sourceArray[0] = 1;
        sourceArray[1] = 2;
        sourceArray[2] = 3;
        sourceArray[3] = 4;
        sourceArray[4] = 5;
        
        int destinationArray[] = new int[sourceArray.length];

        for(int i = 0; i < 5 ; i++){
            destinationArray[i] = sourceArray[i];
        }
        System.out.println("Destination Array:");

        for(int num : destinationArray){
            System.out.print(num +" " );
        }
    }
}
