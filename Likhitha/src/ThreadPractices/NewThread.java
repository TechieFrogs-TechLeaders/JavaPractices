package ThreadPractices;
  public class NewThread implements Runnable {
    public void run(){
      System.out.println("Thread is running Successfully ");
    }
    public static void main(String[] args) {
      Runnable r1 =  new NewThread();   
  //object runnable and String
      Thread th1 = new Thread(r1,"My new thread");    
        //moves thread to active state
      th1.start();   
        
      String str = th1.getName();  
      System.out.println(str);  
      }    
      }    
             
      

   
    


      
    