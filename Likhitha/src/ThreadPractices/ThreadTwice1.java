package ThreadPractices;

public class ThreadTwice1 extends Thread{  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
  ThreadTwice1 t1=new ThreadTwice1();  
  t1.start();  
  t1.start();  
 }  
}  


            


    

