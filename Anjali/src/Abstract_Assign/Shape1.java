package Abstract_Assign;

abstract public class Shape1 {
    String color ;
    boolean filled ;
    public Shape1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public  String  toString(){
        return "Shape [color=" + color + ", filled=" + filled + "]";
    }
}
class Circle extends Shape1{
    double radius;
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", " + super.toString() + "]";
    }
}
class Rectangle extends Shape1 {
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
       return "Rectangle [width=" + width + ", length=" + length + ", " + super.toString() + "]";
    }
}
class Square extends Rectangle {
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth(); // Since Square is a special case of Rectangle where width = length = side
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square [side=" + getSide() + ", " + super.toString() + "]";
    }
}

 class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", true, 5.0);
        Rectangle rectangle = new Rectangle("Blue", false, 4.0, 6.0);
        Square square = new Square("Green", true, 3.0);

        

       
            System.out.println(circle.toString());
            System.out.println("Area: " + circle.getArea());
            System.out.println("Perimeter: " + circle.getPerimeter());
            System.out.println();

            System.out.println(rectangle.toString());
            System.out.println("Area: " + rectangle.getArea());
            System.out.println("Perimeter: " + rectangle.getPerimeter());
            System.out.println();

            System.out.println(square.toString());
            System.out.println("Area: " +square.getArea());
            System.out.println("Perimeter: " +square.getPerimeter());
            System.out.println();
        
    }
}





