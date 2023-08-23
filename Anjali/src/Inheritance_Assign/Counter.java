package Inheritance_Assign;

 class Counter1 {
    int i;
    public void increment(){
        i++;
    }
}
class excounter extends Counter1{
    public void SubCounter() {
        increment();
        increment();
        increment();
        System.out.println("i = " + i);
    }
}

public class Counter {
    public static void main(String[] args) {
        excounter subCounter = new excounter();
        subCounter.SubCounter();
    }
}
