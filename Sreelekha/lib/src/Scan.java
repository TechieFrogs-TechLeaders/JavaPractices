import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        Scanner Scanobj= new Scanner(System.in);
        System.out.println("Enter your name");
        String name= Scanobj.next();
        System.out.println("Name is:" +name);
        Scan.close();
    }

    static void close() {
    }

    public static boolean hasNext() {
        return false;
    }

    public static void next() {
    }

   
}
