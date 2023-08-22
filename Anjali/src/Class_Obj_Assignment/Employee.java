package Class_Obj_Assignment;

public class Employee {
    private String name;
    private int yearOfJoining;
    private String address;
    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println(name + "\t\t" + yearOfJoining + "\t\t" + address);
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee employee3 = new Employee("John", 1999, "26B- WallsStreat");

        System.out.println("Name\tYear of joining\t\tAddress");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
