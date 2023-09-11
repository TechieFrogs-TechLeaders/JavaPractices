package Oops_practices;

public class UncheckedException {
   
    private static final String Method = null;

    public static void main(String[] args) {
      
       int a = 23;
       
       int arr[] = {1,2,3,4,5,6};
      String s ="Hi";

    System.out.println(24);
    System.out.println(12/23);
    try {  
    
      int c = Integer.parseInt(s); 

}catch(NumberFormatException ex){  
 System.err.println(ex); 
 ex.printStackTrace();
}
    
    try{
      System.out.println("Array" +arr[7]);
    }
    catch (ArrayIndexOutOfBoundsException br){
      System.out.println(br);
    }
     try{
        int  b=12/0;
        System.out.println(b);
     }
    
    catch (ArithmeticException sl ) {
         System.out.println(sl);
    }
    try{

        String str = null;
        System.out.println(str.length());
     }
      catch  (NullPointerException de){
        System.out.println(de);
      }
      finally {
        System.out.println("Final is Executed");
      }
        
    
    System.out.println("End of the Program");
    }
  }

    



   



