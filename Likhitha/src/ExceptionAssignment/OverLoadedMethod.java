package ExceptionAssignment;

import java.io.*; 
public class OverLoadedMethod{ 
  void msg() {  
    System.out.println("parent method");  
    }    
}    
    
 class TestExceptionChild extends OverLoadedMethod{    
  
  void msg() throws ArithmeticException  {    
    System.out.println("TestExceptionChild");    
  }  
  
  public static void main(String args[]) {    
   OverLoadedMethod p = new TestExceptionChild();    
   p.msg();    
  }    
}    



