package Oops_practices;

public class UncheckedCustomExceptions extends RuntimeException {
    UncheckedCustomExceptions(String S){
        super(S);
    }

   
    public static void main(String[] args) throws CheckedCustomExceptions {
        int weight = 40;
       
    try{
        if(weight>=50) {
            System.out.println("Eligible to donate blood");
         } else {
            throw new CheckedCustomExceptions("Not Eligible to donate blood");
         }
        } catch(CheckedCustomExceptions u){
            System.out.println(u);
         }
         try{
            throw new NullPointerException("Null");
         }

         catch (NullPointerException ex) {
           // System.out.println("Caught");
            System.out.println(ex);
        
        }
    }
   }
        
         


    

