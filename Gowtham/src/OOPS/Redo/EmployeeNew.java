package OOPS.Redo;

public class EmployeeNew {
   private String name;
   private int yearOfJoining;
   private String address;
   public EmployeeNew(String name,int yearOfJoining,String address){
    this.name=name;
    this.yearOfJoining=yearOfJoining;
    this.address=address;
   }
public void display(){
    System.out.println(name+" \t "+yearOfJoining+" \t\t "+address);
}
public static void main(String[] args) {
    EmployeeNew obj1=new EmployeeNew("Robert", 1994, "64C-WallsStreat");
    EmployeeNew obj2=new EmployeeNew("Sam", 2000, "68D-WallsStreat");
    EmployeeNew obj3=new EmployeeNew("John", 1999,"64c-WallsStreat");
    System.out.println("Name\tYearOfJoining\t\tAddress");
    obj1.display();
    obj2.display();
    obj3.display();

  }   
}
