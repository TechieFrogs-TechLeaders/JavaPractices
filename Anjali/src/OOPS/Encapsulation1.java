package OOPS;

public class Encapsulation1 {
   
    public static void main(String[] args) {
        Encapsulation_Demo mydemo = new Encapsulation_Demo();//since constructor has a statement
        System.out.println(mydemo.getNum());//value is shown get
        System.out.println(mydemo.setmyMethod(45));
        System.out.println(mydemo.getS());
        mydemo.setNum(33);
        System.out.println("Set no:"+mydemo.getNum());
    }
}
