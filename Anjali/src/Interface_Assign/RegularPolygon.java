package Interface_Assign;

public interface RegularPolygon {
    int getNumSides();
   
    double getSideLength();

    default double getPerimeter(){
        return getNumSides() * getNumSides() ;
    }

    default double getInteriorAngle(){
        double n = getNumSides() ;
        return (n-2)* Math.PI / n ;
    }
}

class EquilateralTriangle implements RegularPolygon{
    private double SideLength;
    EquilateralTriangle(double SideLength){
        this.SideLength = SideLength;
    }

    public int getNumSides(){
        return 3;
    }

    public double getSideLength(){
        return SideLength;
    }
}

class Square implements RegularPolygon{
    double SideLength;
    Square(double SideLength){
        this.SideLength = SideLength;
    }

    public int getNumSides(){
        return 4;
    }

    public double getSideLength(){
        return SideLength;
    }
}

class Implimentation{
    public static void main(String[] args) {
        EquilateralTriangle triangle = new EquilateralTriangle(5.0);

        System.out.println("Equilateral Triangle:");
        System.out.println("Number of sides: " + triangle.getNumSides());
        System.out.println("Side length: " + triangle.getSideLength());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Interior Angle: " + triangle.getInteriorAngle());

        Square square = new Square(4.0);

        System.out.println("\nSquare:");
        System.out.println("Number of sides: " + square.getNumSides());
        System.out.println("Side length: " + square.getSideLength());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Interior Angle: " + square.getInteriorAngle());
    }
}