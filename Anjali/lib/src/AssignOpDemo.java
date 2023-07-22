public class AssignOpDemo {
    static int a=2,b=4,i=8;
    static float f=3.8f;
    static double d=8.7;
    static char c='A',g='B';
    static char z='!';
    public static void main(String[] args) 
    {
        long l=9477777777777l;
        byte e=-3;
        short s=-9;
        boolean b1=true;
        boolean b2=false;
        System.out.println("int values :"+(a+=b));//a=2,b=4 (a+b=2+4=6)
        System.out.println(a-=i);//a=6,i=8 (6-8=-2)
        System.out.println("int and float :" +(a+=f));//a=-2,f=3.8  (1.8)  //it took integer value instead of float
        System.out.println("float and double : "+(d+=f));//for double it is giving decimal value
        System.out.println("double and int :" +(d+=a));
        System.out.println("int and double :" +(a+=d));//for int giving int value
        //System.out.println(2.3+=3.5); (left hand side should be a variable)
        System.out.println(b+=2); //b=4
        System.out.println(f-=3);//f=3.8  f=0.79999
        System.out.println("long and float :"+(l-=f));
        System.out.println("a="+a+" "+"l="+l );
        System.out.println("int and long giving negative value :"+(a+=l)); //a=14,
        System.out.println("a="+a+" "+"l="+l );
        System.out.println(l+=a);
        System.out.println("f="+f+" "+"l="+l );
        System.out.println(f-=l);
        System.out.println("s="+s+" "+"a="+a );
        System.out.println(s-=a);//s=-9,a=-1215299570
        System.out.println("s="+s+" "+"f="+f );
        System.out.println(s+=f);
        System.out.println("int and char: " +(b+=c));
        System.out.println("b :"+b);
        System.out.println("char and int :"+(c+=b)); //c=A(65) ,b=71
        System.out.println("char and int :"+(c-=b));
        System.out.println("char and double :"+(g+=d));//g=B(66) ,d=8.7
        System.out.println(g-=d);
        System.out.println("float and char: "+(f+=g));
        
        //System.out.println("boolean value as variable :" +(b1+=a));//undifined for argument
        //System.out.println("variable and boolean :" +(i+=b1));

        //System.out.println("variable and char : "+(i+=@));
        System.out.println("z:" +z+"    "+ "i:"+i);
        System.out.println(z-=i);
        System.out.println(z+=i);
        System.out.println("b:" +b+"    "+ "z:"+z);
        System.out.println(b+=z);




    }
}

