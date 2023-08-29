package Oops_practices;

public class NewClassInstantDemo {
    int a=10;
    int b=15;
    int c=20;
    String str="krish";
    static int d=16;
    void display(){
        System.out.println("In display method");
    }
public static void main(String[] args) {

    NewClassInstantDemo classObject = new NewClassInstantDemo();
    classObject.str="name";
    classObject.d=200;
    classObject.display();

  //  System.out.println(classObject.a+ " " +classObject.str);
    NewClassInstantDemo classObject1 = new NewClassInstantDemo();
    classObject1.str="my name";
    classObject1.d=300;
    classObject1.display();
    NewClassInstantDemo classObject2 = new NewClassInstantDemo();
    classObject2.str="his name";
    classObject2.d=400;
    classObject2.display();
    System.out.println(classObject.str+" "+classObject1.str+ " " +classObject.c);
    System.out.println(classObject2.d+ " " +classObject2.str);
    
}
}
