import java.util.Scanner;
    class Docscan {
        public static void main(String[] args) {
            System.out.println(" Enter my values");
        
            Scanner input = new Scanner(System.in);
            int i =  input.nextInt(); 
            System.out.println("Enter byte");
            byte b = input.nextByte();
            input.close();
            System.out.println("Values are"+i+ " + " +b);    
    }
}