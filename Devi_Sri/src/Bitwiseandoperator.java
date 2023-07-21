class Example {
    public static void main(String[] args){
        int a=10;
        int b=5;
        int c=20;
        float d=2.5f;
        double e=23.28d;
        long f=34564335L;
        char g='r';
        byte h=4;
        short i=9;
    System.out.println(a<b && a<c);  //10<5 F && =false in logical&& doesn't check the secondition if first is false
    System.out.println(a<b & a<c);  //10<5 F & 10<20 T =false  checks both conditions
    System.out.println(a<b && a++<c); //10<5 F && false
    System.out.println(a);//10
    System.out.println(a<b & a++<c); //10<5 F & 10<20 T=FALSE
    System.out.println(a);//11
    System.out.println(true|false); //true |false =true
    System.out.println(false & true);//false & true=false
    System.out.println(2.5<23.28 && 2.5<9); //T&&T=true
    System.out.println(d>e & d<e);//2.5>23.28 =F & 2.5<23.28=T  =false
    System.out.println(e>f | e<f);//23.28>34564335=F | 23.28<34564335=T =true
    System.out.println(g>h & g++<h);//r>4  & r<4 114>4=T  & 114<4=F=false
    System.out.println(g);
    System.out.println(g<h | g-->h);//s>4 | s<4 115<4=F  115>4=T =true
    System.out.println(h<i & h++>i);//4<9=T  & 5>9=F = false
    }
}
