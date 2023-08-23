package OOPS.Redo;

import java.util.Scanner;

public class Area_2 {
     public double length , breadth ;
    public Area_2(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double returnArea() {
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        double length = sc.nextDouble();
        
        System.out.println("Enter the breadth:");
        double breadth = sc.nextDouble();
        
        Area_2 rectangle = new Area_2(length,breadth);
        double area =rectangle.returnArea();        
        System.out.println("Area of rectangle:"+area);
        sc.close();
    }
}
