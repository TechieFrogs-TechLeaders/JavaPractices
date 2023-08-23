package Inheritance_Assign;

 /*class Inheritance {
    public void shape(){
        System.out.println("This is shape");
    }
}
class Rectangle extends Inheritance{
    public void shapRectangle(){
        System.out.println("This is Rectangle shap");
    }
}

class Circle extends Inheritance{
    public void shapCircle(){
        System.out.println("This is circle shape");
    }
}
class Square1 extends Rectangle{
    public void squareRectangle(){
        System.out.println("Square is a rectangle");
    }
}


public class Shape{
    public static void main(String[] args) {
        Square1 square = new Square1();
        square.shapRectangle();
        square.shape();
        
    }
} */

class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    public void printShape() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    public void printShape() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    public void printShape() {
        System.out.println("Square is a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Square mysquare = new Square();
        
        // Call methods of Shape and Rectangle using Square object
        mysquare.printShape();  // Calls Square's printShape() method
        mysquare.printShape();  // Calls Rectangle's printShape() method (inherited)
    }
}

