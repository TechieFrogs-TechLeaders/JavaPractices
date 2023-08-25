package Abstract_Assign;

abstract public class Shape {
    abstract int rectangleArea(int length,int breadth);

    abstract int squareArea(int side);

    abstract double circleArea(double radius);
}
class Area extends Shape{
    int rectangleArea(int length,int breadth){
        return length*breadth;
    }

    int squareArea(int side){
        return side*side;
    }

    double circleArea(double radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Area myArea = new Area();
        int rectangleArea = myArea.rectangleArea(5, 7);
        int squareArea = myArea.squareArea(4);
        double circleArea = myArea.circleArea(3.0);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Circle: " + circleArea);

    }
}