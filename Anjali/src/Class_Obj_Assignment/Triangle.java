package Class_Obj_Assignment;

public class Triangle {
    int a = 3,b = 4,c = 5;
    int parameter = a+b+c;
    double s= parameter / 2 ;
    double area = Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
    public static void main(String[] args) {
        Triangle myobj = new Triangle();
       // myobj.a = 3;
       // myobj.b = 4;
        //myobj.c = 5;
        System.out.println("parameter:"+myobj.parameter);
        System.out.println("area:"+myobj.area);
        }
}
/*class Me{
    int a;
    int tr = a+a ;
    public static void main(String[] args) {
        Triangle myobj = new Triangle();
        System.out.println(myobj.a);

    }
}*/
