public class Bitwiseoroperator{
    public static void main(String[] args){
        int a=10;
        int b=5;
        int c=20;
    System.out.println(a>b || a<c);//10>5=T||10<5=F (true) in logical ||doesn't check the secondition if first one is true
    System.out.println(a>b | a<c); //10>5=T|10<5=F(true) bitwoise | checks both conditions
    System.out.println(a>b || a++<c);//10>5=T||10<20=T(true)
    System.out.println(a>b | a++<c);//10>5=T|11<20=T(true)
    System.out.println(a);//11
    System.out.println(a>b || a--<c);//11>5=T||11<20=T(true)
    System.out.println(a>b | a-->c);//10>5=T|10>20=T(true)
    System.out.println(a);//10
}
}