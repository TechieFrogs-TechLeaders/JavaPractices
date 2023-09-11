package Oops_practices;

public class Encapsulation1 {
    
   
    public static void main(String[] args) {
        Encapsulation myobj = new Encapsulation();//since constructor has a statement
        System.out.println(myobj.getNum());//value is shown get
        System.out.println(myobj.secondMethod(14));
        System.out.println(myobj.getS());
        myobj.setNum(12);
        System.out.println("Set no:"+myobj.getNum());
    }
}


