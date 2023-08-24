package Inheritance_Assign;

public class Member {
   String Name;
   int  Age;
   long Phonenumber;
   String Address;
   double Salary;
   public void printSalary(){
    System.out.println("The salary"+Salary);
   }

}
class Employee extends Member{
    String specialization;
    String department;
    public static void main(String[] args) {
        Employee myEmployee = new Employee();
        myEmployee.Name = "John";
        myEmployee.Age = 45;
        myEmployee.Phonenumber = 4657832917l;
        myEmployee.Address = "Nidadavole";
        myEmployee.Salary = 30000l;
        System.out.println(myEmployee.Name);
        System.out.println(myEmployee.Age);
        System.out.println(myEmployee.Phonenumber);
        System.out.println(myEmployee.Address);
        System.out.println(myEmployee.Salary);
    }
}
class Manager extends Member{
    String specialization;
    String department;
    public static void main(String[] args) {
        Employee myEmployee1 = new Employee();
        myEmployee1.Name = "Jon";
        myEmployee1.Age = 87;
        myEmployee1.Phonenumber = 46577772917l;
        myEmployee1.Address = "Nidadavole";
        myEmployee1.Salary = 780000l;
        System.out.println(myEmployee1.Name);
        System.out.println(myEmployee1.Age);
        System.out.println(myEmployee1.Phonenumber);
        System.out.println(myEmployee1.Address);
        System.out.println(myEmployee1.Salary);
    }
}