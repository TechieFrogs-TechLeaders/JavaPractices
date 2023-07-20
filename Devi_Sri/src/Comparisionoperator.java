public class Comparisionoperator {
    public static void main(String[] args){
        int q=2, r=5;
        float a=10.5f, b=15.8f;
        short c=20, d=25;
        byte e=15, f=35;
        char g='d', h='s';
        long i=2353253L,j=2367L;
        boolean k=true,l=false;
        System.out.println(q==r);//2==5 false
        System.out.println(q<r);//2<5  true
        System.out.println(q>r);//2>5   false
        System.out.println(q<=r);//2<=5  true
        System.out.println(q>=r);//2>=5  false
        System.out.println(q!=r);//2!=5  true
        System.out.println(a==b);//10.5==15.8 false
        System.out.println(a<b);//10.5<15.8 true
        System.out.println(c<d);//20<25 true
        System.out.println(e>f);//15>35 false
        System.out.println(g<=h);//d<=s   100<=115  true
        System.out.println(i>=j);//2353253>=2367  true
        System.out.println(k!=l);//true!=false true
    }
    
}
