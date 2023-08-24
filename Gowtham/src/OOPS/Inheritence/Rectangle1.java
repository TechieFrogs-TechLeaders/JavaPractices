package OOPS.Inheritence;

class Rectangle1 {
    private double length;
    private double breadth;

    public Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Square1 extends Rectangle1 {
    public Square1(double side) {
        super(side, side);
    }
}

class RecSqre {
    public static void main(String[] args) {
        Rectangle1 rectangle = new Rectangle1(6, 9);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println();
        Square1 square = new Square1(5);
        System.out.println("Square:");
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());
    }
}
