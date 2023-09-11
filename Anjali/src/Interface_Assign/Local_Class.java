package Interface_Assign;

public interface Local_Class {
    void myMethod();
}

class Inner_Class {
    void innerMethod(){
       class MyClass implements Local_Class{
            public void myMethod(){
                System.out.println("Local method");
            }
       }
       MyClass myObj = new MyClass();
       myObj.myMethod();
    }
    public static void main(String[] args) {
        Inner_Class myInner_Class = new Inner_Class();
        myInner_Class.innerMethod();
    }
}
