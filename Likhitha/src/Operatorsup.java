public class Operatorsup {
    public static void main(String[] args) {
        int a=14,b=19,c=30;
        System.out.println(a++ - b++ - c++);
        System.out.println(--a + b++ - ++c);
        System.out.println(a+ " " +b+ " " +c);
        //bitwise operators
        System.out.println(a>b & a<b);
        System.out.println(a>b | a<b);
        //Logical operators
        System.out.println(a<b && a>b);
        System.out.println(a>b || a<b);
        System.out.println(14 || 19);
        System.out.println(a+ " " +b + " " +c);
        //Relational operators
        int x=12;
        int y=24;
        System.out.println(x==y);
  
      } 
}
