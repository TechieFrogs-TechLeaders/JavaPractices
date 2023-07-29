import java.util.Scanner;
    public class Nextline {
       public static void main(String[] args)  {
       Scanner Scanobj=new Scanner(System.in);
       System.out.println("Enter item ID");
       // Read the first token
       String itemID =Scanobj.nextLine();
       System.out.println("item = "+itemID);
       String priceStr = Scanobj.nextLine();
              System.out.println("item= "+priceStr);

       Scanobj.close();
       }
    }

