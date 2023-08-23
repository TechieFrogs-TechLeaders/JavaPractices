package Inheritance_Assign;

class Circle {
    protected double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

   
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    //Override
    public double getArea() {
        double baseArea = super.getArea();
        double lateralArea = 2.0 * Math.PI * radius * height;
        double surfaceArea = 2.0 * baseArea + lateralArea;
        return surfaceArea;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}

public class Circle1 {
    public static void main(String[] args) {
        Cylinder mycylinder = new Cylinder(2.0, 3.0);
        
        // Calling getArea() method of Cylinder
        System.out.println("Surface Area of Cylinder: " + mycylinder.getArea());
        
        // Calling getVolume() method of Cylinder
        System.out.println("Volume of Cylinder: " + mycylinder.getVolume());
    }
}

