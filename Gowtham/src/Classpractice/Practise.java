package Classpractice;

public class Practise {
    public static void main(String[] args) {
       int r=5;
     for(int i=r;i>=1;i--){
        for(int j=1;j<=r-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i*2-1;k++){
            System.out.print("*");
        }
        System.out.println();
         }
     }
}