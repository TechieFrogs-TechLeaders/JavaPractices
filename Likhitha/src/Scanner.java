import java.util.Scanner;

 class main {
  public static void main(String[] args) {

    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Double value: ");
     double value = input.nextDouble();
    System.out.println("Using nextDouble(): " + value);

    input.close();
  }
}
