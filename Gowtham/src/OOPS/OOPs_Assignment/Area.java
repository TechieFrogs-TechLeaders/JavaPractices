package OOPS.OOPs_Assignment;

import java.util.Scanner;
public class Area {
    public double length , breadth ;
    public void setDim(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea(){
        return length * breadth;  //6
    }
    public static void main(String[] args) {
        Area myobj = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        double lenght = sc.nextDouble();
        System.out.println("Enter the breadth:");
        double breadth = sc.nextDouble();
        myobj.setDim(lenght, breadth);
        double area = myobj.getArea();
        System.out.println("Area of rectangle: " + area);
        sc.close();
    }
}
