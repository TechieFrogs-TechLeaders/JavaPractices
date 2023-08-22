package OOPS.Redo;

public class Triangle1 {
    int a=3,b=4,c=5;
    int peri=a+b+c;
    double s=peri/2;
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    public static void main(String[] args) {
        Triangle1 obj=new Triangle1();
        System.out.println("perimeter is:"+obj.peri);
        System.out.println("Area is"+obj.area);
    }
}
