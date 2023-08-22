package Method_Assign;

public class Area_Square_Rectangle {
    public static int i = 4;
    public String s = "Hello";
   // private int num = 3;
    protected int a  = 5 ;
    public char[] areaofsquare;
   static double area_Square_Rectangle(double length, double breadth){
        return length*breadth;
       // System.out.println();
    }
    protected int area_Square_Rectangle(int side){
        return side*side;
    }
    public static void main(String[] args) {
        Area_Square_Rectangle myarea = new Area_Square_Rectangle();
        double area =area_Square_Rectangle(4,7);
        System.out.println("The area of rectangle: "+area);
        int areaofsquare = myarea.area_Square_Rectangle(10); 
        System.out.println("The area of Square: "+areaofsquare);
    }
}
