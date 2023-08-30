package OOPS;

public class University {
    static class Courses {
        String name;
        Courses(String name) {
            this.name = name;
        }
        void display() {
            System.out.println("Course: " + name);
        }
    }
    public static Courses Courses;
}
class UniversityExample {
    public static void main(String[] args) {
        University.Courses  bsc_cs= new University.Courses("Computer Science");
        University.Courses bsc_s = new University.Courses("Statistics");
        University.Courses bsc_m =new University.Courses("Maths");
        bsc_cs.display();
        bsc_s.display();
        bsc_m.display();
    }
}
