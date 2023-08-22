package OOPS.Redo;


public class Rectangle_Area {
    private double length;
    private double breadth;

    public Rectangle_Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle_Area obj = new Rectangle_Area(4, 5);
        Rectangle_Area obj2 = new Rectangle_Area(5, 8);

        System.out.println("Rectangle_Area 1:");
        System.out.println("Length: " + obj.getLength());
        System.out.println("Breadth: " + obj.getBreadth());
        System.out.println("  Area: " + obj.calculateArea());
        System.out.println();
        System.out.println("Rectangle_Area 2:");
        System.out.println("Length: " + obj2.getLength());
        System.out.println("Breadth: " + obj2.getBreadth());
        System.out.println("  Area: " + obj2.calculateArea());
    }
}