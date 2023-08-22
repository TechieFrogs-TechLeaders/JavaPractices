package OOPS.Redo;
import java.util.Scanner;

public class Area1 {
    private double length, breadth;
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area1 Obj = new Area1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        double length = sc.nextDouble();

        System.out.println("Enter the breadth:");
        double breadth = sc.nextDouble();

        Obj.setDim(length, breadth);
        double area = Obj.calArea();

        System.out.println("Area of rectangle: " + area);

        sc.close();
    }
}
