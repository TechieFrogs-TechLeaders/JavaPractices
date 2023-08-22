package OOPS.Redo;

public class Triangle_2 {
     int a, b, c;
     int peri;
     double s, area;
        Triangle_2(int A, int B, int C) {
        a = A;
        b = B;
        c = C;
        peri = a + b + c;
        s = peri/2 ; 
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    }
    public static void main(String[] args) {
        Triangle1 myobj = new Triangle1(); 
        Triangle_2 myobj1 = new Triangle_2(myobj.a, myobj.b, myobj.c);
        System.out.println("Perimeter is: " + myobj1.peri);
        System.out.println("Area is :" + myobj1.area);
    }
}





