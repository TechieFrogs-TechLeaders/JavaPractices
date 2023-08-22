package OOPS.Redo;

public class Student2 {
    String name;
    int roll_num;
    long phone_no;
    String address;
    public static void main(String[] args) {
        Student2 obj=new Student2();
        obj.name="Sam";
        obj.roll_num=42;
        obj.phone_no=9876452318l;
        obj.address="delhi";
        System.out.println(obj.name+"  "+obj.roll_num+" "+obj.phone_no+" "+obj.address);
        Student2 obj2=new Student2();
        obj2.name="John";
        obj2.roll_num=21;
        obj2.phone_no=8514796302l;
        obj2.address="kerala";
        System.out.println(obj2.name+" "+obj2.roll_num+" "+obj2.phone_no+" "+obj2.address);
    }

}
