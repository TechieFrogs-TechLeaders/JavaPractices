package OOPS.OOPs_Assignment;
import java.util.Scanner;

public class Area2 {    //7
    public double length , breadth ;
    public Area2(double length , double breadth){
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
        //myobj.setDim(lenght, breadth);
        Area2 rectangle = new Area2(length,breadth);
        //Area myobj = new Area();
        double area =rectangle.returnArea();        
        System.out.println("Area of rectangle:"+area);
        sc.close();
    }
}

