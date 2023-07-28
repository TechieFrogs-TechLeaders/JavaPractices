import java.util.Scanner;

public class Scan_StringDemo1 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter int val:");
        int i = input.nextInt();
        input.nextLine();
        System.out.println("Enter the value1:");
        String s1=input.nextLine();
        
        System.out.println("Enter the value2:");
        String s=input.nextLine();
        System.out.println("Enter the value3:");
        String s2=input.nextLine();
        System.out.println("Int vaalue is: "+i);
        System.out.println("The String values are: "+s);
        System.out.println(s1);
        System.out.println(s2);
        input.close();
    }
    
}
