
    import java.util.Scanner;

 class Scan {
  public static void main(String[] args) {
         System.out.println("Enter my values");
    
    Scanner input = new Scanner(System.in);
      int i = input.nextInt();
     // boolean b = input.nextBoolean();

     System.out.println("Hi Hello");
      String s = input.next();

          input.close();
           
           System.out.println("My Input Value Is " +i+"  " +s);


  }
}


