import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Scanner_Demo {
    public static void main(String[] args) {
       
        Scanner Scobj=new Scanner(System.in);
        System.out.println("Enter the value :");
        //int 
    
        int num1=Scobj.nextInt();
        int num2=Scobj.nextInt();
        int num3=Scobj.nextByte();
        System.out.println("The int values  are:"+num1+"  "+num2+"  "+num3);
        
        //BigDecimal 
        System.out.println("Enter the BigDecimal values:");
        BigDecimal num4=Scobj.nextBigDecimal();
        System.out.println("The values are:"+num4);

        //BigInteger
        System.out.println("Enter the BigInteger:");
        BigInteger num5=Scobj.nextBigInteger();
        System.out.println("The BigInteger value: "+num5);
        
        //float
        System.out.println("Enter the float values:");
        float f1=Scobj.nextFloat();
        float f2=Scobj.nextFloat();
        System.out.println("the float values are :" +f1+"  "+f2);

        //Double
       // System.out.println("Enter the Double Values:");
        //double d1=Scobj.nextDouble();
        //double d2=Scobj.nextDouble();
        //System.out.println("The values are:"+d1+" "+d2);

        //Boolean
        System.out.println("Enter Boolean values:");
        boolean b1=Scobj.nextBoolean();
        System.out.println("The boolean values:"+b1);


        Scobj.close();
    }
    
}
