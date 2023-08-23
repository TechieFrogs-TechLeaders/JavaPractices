package Inheritance_Assign;

public class Rectangle {
    double length,breadth;
    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double rectanglePerimeter(){
        return 2*(length+breadth);
    }
    public double rectangleArea(){
        return length*breadth;
    }
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5,8);
        double perimeter = myRectangle.rectanglePerimeter();
        double area = myRectangle.rectangleArea();
        System.out.println("perimeter:"+perimeter+"    Area:"+area);
    }
}
    class Square extends Rectangle{

        Square(int s) {
            super(s, s);
           
        }
        public static void main(String[] args) {
         Square mySquare = new Square(7);
        double sperimeter = mySquare.rectanglePerimeter();
        double sarea = mySquare.rectangleArea();
        System.out.println("perimeter:"+sperimeter+"    Area:"+sarea);
     }
}
