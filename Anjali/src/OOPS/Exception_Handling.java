package OOPS;

import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        int a = 3;
        Scanner sc = new Scanner(System.in);
        
        try{
            int num = sc.nextInt();
            //String str = null;
           // int b = 4 / 0 ;
            
           // ? System.out.println(str.length());
            System.out.println(num);
            //System.out.println(b);
        }
        catch(NullPointerException ne){
            ne.printStackTrace();
            System.out.println(ne.getMessage());
            String str = "Hello World";
            System.out.println("length of String : " +str.length());
            //int  b = 4/2;
            //System.out.println(b);
        }finally{
            sc.close();
        }

        System.out.println(a);
        
    }
}
