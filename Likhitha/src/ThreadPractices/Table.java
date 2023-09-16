package ThreadPractices;
public class Table{
   synchronized static void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
        try{
            Thread.sleep(500);
        }catch(Exception aa){
            System.out.println(aa);
        }
    }
}
}
    class MyThread1 extends Thread{
        Table t;
        MyThread1 (){
            this.t = t;
        }
        public void run(){
            t.printTable(5);
        }
    }
    class MyThread2 extends Thread{
        Table t;
        MyThread2 (Table t){
            this.t = t;
        }
        public void run(){
            t.printTable(100);
        }
    }

class TestSynchronized {

    public static void main(String[] args) {
        Table Obj = new Table();
            MyThread1 t1 = new MyThread1(Obj);
            MyThread1 t2 = new MyThread1(Obj);
            t1.start();
            t2.start();
        
    }
}

   