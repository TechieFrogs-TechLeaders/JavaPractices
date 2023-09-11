package ExceptionAssignment;

public class NegativeArray {
    public static void main(String[] args) {
        try {
            int arr[] = new int[-5];
        }catch(NegativeArraySizeException er){
            System.out.println(er);
        }

    }
}
