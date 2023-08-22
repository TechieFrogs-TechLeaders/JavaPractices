package OOPS.OOPs_Assignment;
public class Triangle {         //3
    int a = 3,b = 4,c = 5;
    int parameter = a+b+c;
    double s= parameter / 2 ;
    double area = Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
    public static void main(String[] args) {
        Triangle myobj = new Triangle();
       // myobj.a = 3;
        System.out.println("perimeter:"+myobj.parameter);
        System.out.println("area:"+myobj.area);
        }
}

