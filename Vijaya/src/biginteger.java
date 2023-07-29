import java.math.BigInteger;
import java.util.Scanner;

public class biginteger {
    public static void main(String[] args) {
        Scanner Scanobj = new Scanner(System.in);
        System.out.print("enter the number you want");
        BigInteger num=Scanobj.nextBigInteger();//it is an object 
        BigInteger num1=Scanobj.nextBigInteger();//by using wrapperclass
        System.out.println("output value "+num.add(num1));
        Scanobj.close();
    }
}
    

