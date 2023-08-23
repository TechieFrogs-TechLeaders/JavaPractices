package OOPS.Methods;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
        name = "unknown";
        age = 0;
        address = "not available";
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Student[] obj = new Student[10];
        for (int i = 0; i < obj.length; i++) {
            obj[i] = new Student();
        }

        obj[0].setInfo("stephen", 20, "177 Bleecker St");
        obj[1].setInfo("Jane", 22, "456 Elm St");
        for (int i = 0; i < obj.length; i++) {
            obj[i].displayInfo();
        }
    }
}