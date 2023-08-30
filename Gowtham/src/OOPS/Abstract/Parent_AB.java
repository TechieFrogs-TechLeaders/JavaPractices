package OOPS.Abstract;

 abstract class Parent_AB {
   abstract void message();  
}
class FirstSubClass extends Parent_AB{
    void message(){
        System.out.println("the first sub class");
    }
}
class SecondSubClass extends FirstSubClass{
    void message(){
        System.out.println("the second sub class");
    }
}
class AbstractDem{
    public static void main(String[] args) {
        FirstSubClass firstObj=new FirstSubClass();
        SecondSubClass secondObj=new SecondSubClass();
        firstObj.message();
        secondObj.message();
    }
}