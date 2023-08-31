package Package1;

//import Package2.NewTest;

import Package2.NewTest; //imports all class from package2

public class New extends NewTest{
    New(){
        //super();
        System.out.println("New method");
    }
    public static void main(String[] args) {
        Test myTest = new Test();  //Since same package
        System.out.println(myTest.x);
        
        NewTest myTest2  = new NewTest();  
       System.out.println(myTest2.x);


    }
}
