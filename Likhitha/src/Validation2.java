import java.util.Scanner;
    class Validation2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an integer: ");

           if (input.hasNextInt()) {
                int i = input.nextInt();
                System.out.println("You entered" +i);
            }else{
                System.out.println("Inavalid input");
            }
            System.out.println("Enter a boolean: ");
          if   
            (input.hasNextBoolean()) {
                boolean b = input .nextBoolean();
                System.out.println("You entered" + b);
            } else {
                System.out.println("Invalid input");
            }
            System.out.println("Enter a long:");
            
            if(input.hasNextLong()) {
                long l = input .nextLong();
                    System.out.println("You entered " +l);
            } else {
                System.out.println("Invalid input");
            }
            System.out.println("Enter a float: ");

            if (input.hasNextFloat()) {
                float f = input.nextFloat();
                System.out.println("You entered " +f);
            } else {
                System.out.println("Invalid input");

            }
             input.close();
        }
    }




    
    

    

