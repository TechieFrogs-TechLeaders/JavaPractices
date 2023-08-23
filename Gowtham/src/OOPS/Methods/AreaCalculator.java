package OOPS.Methods;

public class AreaCalculator {
  
    public void calAndPrint(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void calAndPrint(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }
    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        obj.calAndPrint(9, 19); // Rectangle
        obj.calAndPrint(10);              // Square
    }
}