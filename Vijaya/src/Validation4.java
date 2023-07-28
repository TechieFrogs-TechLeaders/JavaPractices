import java.util.Scanner;
public class Validation4 {
    public static void main(String[] args) {
        Scanner Scanobj = new Scanner(System.in);
        System.out.println("please enter the value");
        if(Scanobj.hasNextInt());
            int n = Scanobj.nextInt();
            System.out.println("entered value:"+n); 
        boolean b=Scanobj.hasNextFloat();
        System.out.println("you enterd value :"+b);
    Scanobj.close();
}
}

