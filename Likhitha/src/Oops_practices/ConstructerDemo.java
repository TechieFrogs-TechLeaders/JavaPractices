package Oops_practices;

public class ConstructerDemo {
    int a;
     String str;
    void display(){
        System.out.println("In display");
    }

    //default constructer
    public ConstructerDemo(){
        a=10;
        str="name";
    System.out.println("Hey I Am Here");
    }


public static void main(String[] args) {

  ConstructerDemo classObject = new ConstructerDemo();
 // classObject.str="college"; 
  classObject.display();
  ConstructerDemo classObject1 = new ConstructerDemo();
 // classObject1.str="nursery";
  classObject1.display();
  ConstructerDemo classObject2 = new ConstructerDemo();
//  classObject2.str="preschool";
  classObject2.display();
  System.out.println(classObject.str+ " " +classObject.a+ " " +classObject2.str);


}
    
}
