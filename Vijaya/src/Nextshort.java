import java.util. Scanner;
public class Nextshort{
    public static void main(String[] args){
        Scanner Scanobj = new Scanner(System.in);
        System.out.println("enter the value:");
        short num = Scanobj.nextShort();
        System.out.println("outputvalue:"+(num*(num+2/2)));
        Scanobj.close();
    }
}
    

