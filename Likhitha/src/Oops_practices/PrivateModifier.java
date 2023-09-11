package Oops_practices;

public class PrivateModifier {
    private int a =10;
    int b=20;
void display(){
    System.out.println("In Default");
}
public static void main(String[] args) {
    int c=28;
    PrivateModifier classObject = new PrivateModifier();
    classObject.display();
    System.out.println(classObject.b+" "+classObject.a);
}
}






    
