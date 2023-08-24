package OOPS.Inheritence;

class Circle1 {
    protected double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle1 {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

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

 class Circular {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(2.0, 3.0);
        System.out.println("Surface Area of Cylinder: " + myCylinder.getArea());
        System.out.println("Volume of Cylinder: " + myCylinder.getVolume());
    }
}