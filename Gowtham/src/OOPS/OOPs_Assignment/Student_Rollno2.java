package OOPS.OOPs_Assignment;
                                    //2
public class Student_Rollno2 {
    int roll_num;
    long phone_no;
    String address;
    String name;
    public static void main(String[] args) {
        Student_Rollno2 myobj = new Student_Rollno2();
        myobj.name = "sam";
        myobj.roll_num = 21;
        myobj.phone_no =  7892465374l; 
        myobj.address = "chennai";
        System.out.println(myobj.name+" "+myobj.roll_num+" "+myobj.phone_no+" "+ myobj.address);
        Student_Rollno2 myobj1 = new Student_Rollno2();
        myobj.name = "john";
        myobj1.roll_num = 69;
        myobj1.phone_no = 3412365374l; 
        myobj1.address = "bangalore";
        System.out.println( myobj.name+" "+myobj1.roll_num+" "+myobj1.phone_no+" "+ myobj1.address);
    }
} 
