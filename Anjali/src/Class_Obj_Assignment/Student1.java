package Class_Obj_Assignment;

public class Student1 {
    String name;
    int roll_num;
    long phone_no;
    String address;
    public static void main(String[] args) {
        //Student myobj2 = new Student(); //Since the class is private it is not visible
        //myobj1.roll_no;  //Cannot access private variables
        Student1 myobj = new Student1();
        myobj.name = "Sam";
        myobj.roll_num = 23;
        myobj.phone_no = 2345465374l; 
        myobj.address = "Hyderabad";
        System.out.println( myobj.name+" "+myobj.roll_num+" "+myobj.phone_no+" "+ myobj.address);
        Student1 myobj1 = new Student1();
        myobj1.name = "John";
        myobj1.roll_num = 78;
        myobj1.phone_no = 3453465374l; 
        myobj1.address = "vizag";
        System.out.println( myobj1.name+" "+myobj1.roll_num+" "+myobj1.phone_no+" "+ myobj1.address);
    }
}
