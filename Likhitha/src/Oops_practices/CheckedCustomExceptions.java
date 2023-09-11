package Oops_practices;

import java.io.IOException;

public class CheckedCustomExceptions extends IOException{
    CheckedCustomExceptions(String message) {
        super(message);  
}
}
   class Driverclass {
    public static void main(String[] args) {
        int age = 18;
        try {
            if(age>18) {
                System.out.println("Eligible");
            }else{
              throw new CheckedCustomExceptions("Not Eligible");
            }
        }catch(CheckedCustomExceptions c){
                System.out.println(c);
            }
        
    
}
   }
   


