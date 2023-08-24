package OOPS.Inheritence;

public class Counter {
    static int i;

    public void increment() {
        i++;
    }
}
class SubCounter extends Counter {
    public void display() {
        increment();
        increment();
        increment();
        System.out.println("i = " + i);
    }
}

 class inc {
    public static void main(String[] args) {
        SubCounter subCounter = new SubCounter();
        subCounter.display(); 
    }
}

