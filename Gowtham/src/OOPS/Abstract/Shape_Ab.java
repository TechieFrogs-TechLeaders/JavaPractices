package OOPS.Abstract;

abstract class Shape {
    abstract double rectangleArea(double length, double breadth);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}

class Area extends Shape {
    double rectangleArea(double length, double breadth) {
        return length * breadth;
    }
    
    double squareArea(double side) {
        return side * side;
    }
    
    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

 class AreaExample {
    public static void main(String[] args) {
        Area areaObj = new Area();
        
        double rectangleArea = areaObj.rectangleArea(5, 8);
        double squareArea = areaObj.squareArea(5);
        double circleArea = areaObj.circleArea(4);
        
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
