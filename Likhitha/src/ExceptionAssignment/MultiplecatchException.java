package ExceptionAssignment;
public class MultiplecatchException{
   
  public static void main(String[] args) {
    try {
      int arr[] = new int[10];
      arr[10] = 30 / 0;
    } catch (ArithmeticException e) {
      System.out.println(e);

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    } 
  }
}
