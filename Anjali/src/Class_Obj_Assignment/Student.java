package Class_Obj_Assignment;

public class Student {
    String name;
    private int roll_no;
    public static void main(String[] args) {
        Student myobj = new Student();
        myobj.name = "John";
        myobj.roll_no = 2;
        System.out.println(myobj.name+" "+myobj.roll_no);
    }
}
/*class A{
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.roll_no;
    }
}*/