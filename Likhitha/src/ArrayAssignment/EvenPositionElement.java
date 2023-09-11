package ArrayAssignment;

public class EvenPositionElement {
    private static int i;

    public static void main(String[] args) {
        int arr[] = {1,5,6,7,9,3};
        for(int i=2;i<arr.length;i=i+2){
        
    System.out.println(arr[i]+ "th Even position :" +i);
    }
}
}