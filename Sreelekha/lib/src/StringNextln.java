import java.util.Scanner;
public class StringNextln{
    public static void main(String[] args){
        Scanner Scanobj = new Scanner(System.in);
        System.out.println("Enter item ");
        String item = Scanobj.nextLine();
        
        System.out.print("item= " +item );
        item = Scanobj.nextLine();
        System.out.println("sum of item:" +item);
        
        
        Scanobj.close();

    
        
    }
}

    

