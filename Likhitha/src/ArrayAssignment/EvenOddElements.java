package ArrayAssignment;

public class EvenOddElements {
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,8,9,3,2,};
        System.out.println("Odd Numbers:");
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Even Numbers:");
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }


}
