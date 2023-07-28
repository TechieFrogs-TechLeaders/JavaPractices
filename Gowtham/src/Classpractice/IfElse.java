package Classpratice;


public class IfElse {
    static int year=2020;
    public static void main(String[] args) {
       // int year=2011;
        if((year % 4 ==0 && year % 100 !=0) || year % 400==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
        String output=(year%2==0)?"even number":"odd number";//ternary operator if-else.
        System.out.println(output);
    }
}
