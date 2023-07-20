public class Compareop {
    public static void main(String args[]){
        //comparision operators
        int a1=1,b1=2,c1=1;
        float f1=20.66f,f2=21.33f,f3=21.11f;
        double d1=20.028d,d2=90.04d,d3=24.56d;
        char m1='A',m2='4',m3='*';
        byte bn1=5,bn2=6,bn3=8;
        boolean e1=true,e2 = false;
        short s1=-29,s2=378;
        long l1=23456L,l2=-12345L;
        //comparision operators for integers
        //== operator
        System.out.println(a1==b1);//It returns output as true/false
        System.out.println(b1==c1);
        System.out.println(c1==a1);
        //comparision operators for float values
        System.out.println(f1==f2);
        System.out.println(f2>=f3);
        System.out.println(f1<=f2);
        System.out.println(f1!=f3);
        //comparision operators for double values
        System.out.println(d1!=f3);
        System.out.println(a1>=d3);
        //comparision operators for characters
        System.out.println(m1<=m2);//convert m1 value into ASCII value 
        System.out.println(m2==m3);
        //comparision operators for byte datatype
        System.out.println(bn1!=bn3);
        System.out.println(bn2>=bn1);
        //comparision operators for boolean datatype
        System.out.println(e1!=e2);
        System.out.println(e1==e2);
        //It doesnot works for below condition(<=,>=) in boolean datatype
        //System.out.println(e1>=e2);
        //comparision operators for short datatype
        System.out.println(s1!=s2);
        System.out.println(s1>=s2);
        //comparision operators for long datatype
        System.out.println(l1!=l2);
        System.out.println(l1>=l2);






        








    }
    

}
