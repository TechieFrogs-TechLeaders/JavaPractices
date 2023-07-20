package Basicassignment;

public class Largestamong3num {
    public static void main(String args[]){
        int a=100,b=60,c=100,d=100;
        if(a>b && a>c && a>d)
        System.out.println("a is largest");
        else if(b>c && b>a && b>d)
        System.out.println("b is largest");
        else if(c>d)
        System.out.println("c is largest");
        else
        System.out.println("d is largest");
    }
    
}
