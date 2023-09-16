package ThreadPractices;

public class ExampleThreadString extends Thread {
    public void run(){
        System.out.println("Thread is running created by extended to parent Thread class");
    }
    public static void main(String[] args) {
        ExampleThreadString myThread = new ExampleThreadString();
        myThread.start();
    }
    
}
