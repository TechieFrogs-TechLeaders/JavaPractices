public class BitOperatorDemo {
    static int a=5,b=10,c=3;
    static long l=564748383777777777l;
    public static void main(String[] args) {
        //we cannot take float,double and char dat types without assigning them to variavles
        float d=32.4f;
        double e=3.9;
        char f='A';
        char g='B';
        byte h=-3;
        short s=-5;
        boolean b1=true;
        boolean b2=false; 
        //Bitwise AND /OR Operators taking integers convert to binary and gives result
        System.out.println("Bitwise taking int= "+(a&b));
        System.out.println("Bitwise or =" +(a|b));
        System.out.println("long :" +(a&l));
        System.out.println("long Or: "+ (b|l));
        System.out.println("Using long datatype directly :" +(4&5555555555555555l));
        System.out.println(2&3);
        System.out.println(4|5);
        System.out.println("For negative values :" + (-2&6));
        System.out.println(9|-5);
        System.out.println(h&s);
        System.out.println(h|s);
        //System.out.println(e&s); //double/float and short (integer) cannot be used together
        //System.out.println(d&a);
        System.out.println(a&s);
        System.out.println("Character and integer :" + (f&s)); //f=102 //Binary value (0100 0110)
        
        
        
        //And /Or operators cannot be used for float
        //System.out.println(2.4&3.6);  
        //System.out.println(4.5|6.4);
        //System.out.println("Not happening for int and floating values: "+(a&d));  //System.out.println(a&e);
        System.out.println("Bitwise & for Char Datatype: "+(f&g));
        //System.out.println("not happening for characters with out assigning to variables: "+(n&m));
        System.out.println("Bitwise | for Char Datatype: "+(f|g));
        //System.out.println(z|m);
        System.out.println("For Bitwise And Operator if both are true then true Else false");
        System.out.println("For Boolean values: "+ (true&true));
        System.out.println(false&false);
        System.out.println(true&false);
        System.out.println(false&true);
        System.out.println(b1&b2);
        System.out.println(b2&b1);
        //for Bitwise Or Operator if any one condition is true then true else if both are false then false
        System.out.println("Bitwise Or :");
        System.out.println(true|true);
        System.out.println(false|true);
        System.out.println(false|false);
        System.out.println(true|false);
        System.out.println(b1|b2);
        System.out.println(b2|b1);
        //In Bitwise operator checks both the conditions before giving the result 
        System.out.println("Conditions in Bitwise &= "+(a>b&b<c));
        System.out.println(a<b&b<c);
        System.out.println(a<b&c<b);
        System.out.println(a<b&b>c);
        System.out.println(a>b&c>d);
        System.out.println(b>c&c<d);
        System.out.println(a<c&d<l);
        System.out.println("Conditons in Bitwise Or(|) : " +(a>b|c>d));
        System.out.println(a<b|c<b);
        System.out.println(a<b|d<c);
        System.out.println(b<c|c>d);
        System.out.println(a>b|c>e);
        System.out.println(a<c|d<l);
        System.out.println(f<s|d<a); //in conditions integers and double can be used together 
    }
}
