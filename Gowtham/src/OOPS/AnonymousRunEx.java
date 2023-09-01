package OOPS;
public class AnonymousRunEx {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
    
            public void run() {
                for (int i = 1; i <= 9; i++) {
                    System.out.println("Count: " + i);
                }
            }
        });

        thread.start();
    }
}