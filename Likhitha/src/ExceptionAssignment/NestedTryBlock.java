package ExceptionAssignment;

public class NestedTryBlock {
    public static void main(String[] args) {
        try{    
            System.out.println("going to divide by 0");    
            int b =39/0;    
          }  
          catch(ArithmeticException e) {  
            System.out.println(e);  
          }    
          try{    
            int a[]=new int[5];    
             System.out.println("Array"+a[6]);    
             }  
            catch(ArrayIndexOutOfBoundsException e)  
            {  
               System.out.println(e);  
            }   
 
            catch(Exception e){  
           System.out.println("handled the exception (outer catch)");  
            }    
  
           System.out.println("normal flow");  
            }    
            }
 
