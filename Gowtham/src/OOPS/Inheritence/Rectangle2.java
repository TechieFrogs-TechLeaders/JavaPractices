package OOPS.Inheritence;

public class Rectangle2 {
    private double length;
    private double breadth;

    public Rectangle2(double length, double breadth) {
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

class Square2 extends Rectangle2 {
    public Square2(double side) {
        super(side, side);
    }
}

 class SqrtRec2 {
    public static void main(String[] args) {
        Square2[] squares = new Square2[10];

        for (int i = 0; i < 10; i++) {
            squares[i] = new Square2(i + 1); // Creating squares with sides 1 to 10
        }

        for (int i = 0; i < 10; i++) {
            double area = squares[i].calculateArea();
            System.out.println("Area of square with side " + (i + 1) + ": " + area);
        }
    }
}