

public class DataType {
    static boolean t1;
    static short s1;
    //The static block can be used to assign values to blank static only
    //Any thing with in {--- } is a block
    static
    {
        s1=3;
    }
    static char c='a';
    static char c2=200;
    //For Numeric data types default value is "0"
    static byte b;
    static int i=64;
    //For lonf dataType we have to mention L/l in the Literal else it will consider int
    static long l=999999999999l;
    //for float if .0 or decimal value not given it takes .0 by default 
    static float f=32;
    //For Floating datatype like flot and Double default values is "0.0"
    static float f2;
    static double d=54;

     public static void main(String[] args) {
        short s2=2;
        char c1='v';
        c1='y';
        char c3=75;
        byte b1=74;
        int i1=98;
        long l1=88555555555888888l;
        //If for long datatype in literal "l" not given by default it takes as int
        long l2=75654;
        boolean t1=false;
        //since long and int are smaller datatype then float we can use them in float
        float f1=5464855444333333332l;
        //since float is smaller than double it an be used
        double d1=43.84f;
        System.out.println("Short data type values:"+s1+" "+s2+" ");
        System.out.println("Char DataType: "+c+" "+c2+" "+c1+" "+c3);
        System.out.println("Byte Datatype: "+b+" "+b1+" ");
        System.out.println("int Datatype: "+i+" "+i1+" "+l2);
        System.out.println("Long Datatype: "+l+" "+l1+" ");
        //if static and local variable have the same variable name then we can access the static variable by using class name
        System.out.println("Boolean Datatyp: "+t1+" "+DataType.t1);
        System.out.println("Float DataType: "+f+" "+f1+" "+f2);
        System.out.println("Double DataType: "+d+" "+d1);
    }
    
}
