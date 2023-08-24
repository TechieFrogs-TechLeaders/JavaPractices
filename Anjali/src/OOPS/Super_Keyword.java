package OOPS;

public class Super_Keyword {
    int t = 4;
    Super_Keyword(){
        System.out.println("This is Super class constructor");
    }
    public void newMethod(int a ,int b){
        String color = "Purple";
        System.out.println(color);
        System.out.println("The sum in super class :"+ (a+b));
    }
}
class Middle_class extends Super_Keyword{
    public void newMethod(int a ,int b,String s){
        String color = "Black";
        System.out.println(color);
        System.out.println("Hierarchical inheritance");
        super.newMethod(3,5);
        System.out.println("The super value"+super.t);
    }
}

class Sub_class extends Super_Keyword{
    Sub_class(){
        super();
    }
   public void newMethod(){
        //super();
        String color = "Green";
        System.out.println(color);
        super.newMethod(4,5);
    }
    
}

class Additional extends Sub_class{
    public void newMethod(){
        super.newMethod();
        System.out.println("This is multilevel");
        super.newMethod();
    }
}
class Final_Class{
    public static void main(String[] args) {
        Sub_class myobj = new Sub_class();
        myobj.newMethod();
        Middle_class myobj1 = new Middle_class();
        myobj1.newMethod(4,6,"Hello");
        Additional myobj2 = new Additional();
        myobj2.newMethod();
    }
}
