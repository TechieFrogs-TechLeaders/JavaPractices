package ExceptionAssignment;

public class ArrayOutOfBound {
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,6,7};
    try{
        System.out.println("Array" +arr[8]);
    }

      catch(ArrayIndexOutOfBoundsException ge){
      System.out.println(ge);
}
    }
}


