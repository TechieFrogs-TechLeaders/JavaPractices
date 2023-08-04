public class LogicOpDemo {
    static int a=2,b=4,i=8;
    static float f=3.8f;
    static double d=8.7;
    static char c='A',g='B';
    public static void main(String[] args) {
        long l=9477777777777l;
        byte e=-3;
        short s=-9;
        boolean b1=true;
        boolean b2=false;
        //System.out.println(a&&b);
        //System.out.println(a||b);
        System.out.println("Logical operators can only used for conditions");
        System.out.println("Logical (&) operator for integers : " + (a<b&&i>b));
        System.out.println(a+" "+b+" "+" "+i);
        System.out.println(a>b&&a>i);//a=2>b=4 is false so it directly prints false without checking other condition
        a+=4;
        System.out.println("In And "+(a>b&&a>i));
        System.out.println(a>b&&b>i);
        System.out.println(a>b&&b>i);
        System.out.println("it can also be used for foat and int :" + (a>f&&b<i));
        System.out.println("All float and doble values: "+(3.4<3&&5.4>6));
        System.out.println(3.4<3.3&&5.4>6.5);
        System.out.println("Negative numbers directly:"+(-2>-5&&-5<6.4));
        System.out.println(4.6<-3&&c>l);
        System.out.println("All floating (float,double) values:"+(f>d&&d<f));
        System.out.println(d>f&&a<b);//it takes vriables and values of integers and floating points
        System.out.println("For long values and char and negative value :"+(l>a&&s<c));
        System.out.println(c>l&&a>l);
        System.out.println("char and int: "+(c>g&&a>b));//it is also taking char
        //System.out.println("giving char directly:"+(z>j&&k<a));
        //if the charters are not assigned to variables giving error as not defined
        System.out.println("char and floating values :" +(c>f&&g>d));
        System.out.println("All characters :"+(c<g&&g>a));
        System.out.println("For negative values and int :"+(e>a&&s<b));
        System.out.println("negtive and long :"+(s<e&&a>l));
        System.out.println("chr and negtive  and float:"+(c>e&&g<f));
        
        //Logical (|) OR
        System.out.println("Logical (|) operator for integers : " + (a<b||i>b));
        System.out.println(a>b||a>i);
        System.out.println(a>b||b>i);
        System.out.println(a>b||b>i);
        System.out.println("it can also be used for foat and int :" + (a>f||b<i));
        System.out.println("All float and doble values: "+(3.4<3||5.4>6));
        System.out.println(3.4<3.3||5.4>6.5);
        System.out.println("Negative numbers directly:"+(-2>-5||-5<6.4));
        System.out.println(4.6<-3||c>l);
        System.out.println("All floating (float,double) values:"+(f>d||d<f));
        System.out.println(d>f||a<b);//it takes vriables and values of integers and floating points
        System.out.println("For long values and char and negative value :"+(l>a||s<c));
        System.out.println("char and int: "+(c>g||a>b));//it is also taking char
        //System.out.println("giving char directly:"+(z>j||k<a));
        //if the charters are not assigned to variables giving error as not defined
        System.out.println("char and floating values :" +(c>f||g>d));
        System.out.println("All characters :"+(c<g||g>a));
        System.out.println("For negative values and int :"+(e>a||s<b));
        System.out.println("negtive and long :"+(s<e||a>l));
        System.out.println("chr and negtive  and float:"+(c>e||g<f));
        /*System.out.println("For Boolean values: "+ (true>true&&false<false));
        For Boolean values <,> operators are not defined */
       // System.out.println(b1>a||b2>b1);      (Even if we assign them to variables it does not work)




    }

}
