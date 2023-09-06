package Array_Assign;

public class ArrayContainsGivenValue {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 8, 5};
        int target = 2;
        int value = 0;

        for( int i = 0; i < arr.length ; i++ ){
            if( arr[i] == target){
                value = 1;
            }
        }

        if( value == 1 ){
            System.out.println("The array contains the value : " + target );
        }
        else{
            System.out.println("The array does not contains the value : " + target);
        }
    }
}
