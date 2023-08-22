package Class_Obj_Assignment;

public class Triangle1 {
    int a ,b , c;
    int parameter;
    double s , area;
    Triangle1(int a,int b,int c){
        this.a = a;//only given when the values like variables values are same
        this.b = b;
        this.c = c;
        parameter = a+b+c;
        s= parameter / 2 ;
        area = Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
    }
    public static void main(String[] args) {
        Triangle myobj = new Triangle(); //calling defauit variables of a,b,c from other file
        Triangle1 myobj1 = new Triangle1(myobj.a,myobj.b,myobj.c);
        System.out.println("Parameter:"+myobj1.parameter);//we passed the values to the constructur
        System.out.println("Area:"+myobj1.area);
    }
}
