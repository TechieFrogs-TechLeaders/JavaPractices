package OOPS;

public class Public_Method {
    //public method require a obj to call it
    public void myPublicMethod(){
        System.out.println("This is a public method");
    }
    public static void main(String[] args) {
        Public_Method myobj=new Public_Method();
        myobj.myPublicMethod();
    }
}
