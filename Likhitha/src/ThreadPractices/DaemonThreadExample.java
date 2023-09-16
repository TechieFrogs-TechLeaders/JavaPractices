package ThreadPractices;

public class DaemonThreadExample extends Thread {
    public void run(){
          if(Thread.currentThread().isDaemon()){
System.out.println("Daemon Thread Work");
          }else{
            System.out.println("User Thread Work");
          }
        }
        public static void maim(String[] args){
            DaemonThreadExample t1=new DaemonThreadExample() ;
            DaemonThreadExample  t2=new DaemonThreadExample();
            DaemonThreadExample t3=new DaemonThreadExample() ;      
                t1.setDaemon(true);
                t1.start();//starting threads  
                t2.start();  
                t3.start();  
               }  
              }  

