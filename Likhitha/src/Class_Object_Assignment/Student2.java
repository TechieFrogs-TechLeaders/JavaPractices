package Class_Object_Assignment;

public class Student2 {
    int rollNo;
    int phonenumber;
    String Address;
    public static void  main(String[] args) {
        Student2 sam = new Student2();
        Student2 john = new Student2();
        sam.rollNo = 2;
        sam.phonenumber =1234567890;
        sam.Address = "Duddukuru";
        john.rollNo = 4;
        john.phonenumber = 232342433;
        john.Address = "Rajamundry";
        System.out.println(sam.rollNo+" "+sam.phonenumber+" "+sam.Address);
        System.out.println(john.rollNo+" "+john.phonenumber+" "+john.Address);
    }

}
