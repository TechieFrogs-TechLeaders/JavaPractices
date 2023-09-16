package ThreadPractices;
    public class ExampleRunnable implements Runnable{

        @Override
        public void run() {
        System.out.println("Thread has Ended");
        }
         public static void main(String[] args) {
          ExampleRunnable ex = new ExampleRunnable();
          Thread t1 = new Thread(ex);
          t1.start();
          System.out.println("Hi");

        } 

}
