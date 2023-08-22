package OOPS.OOPs_Assignment;
public class Triangle2 {       //4
        int a ,b , c;
        int parameter;
        double s , area;
        Triangle2(int x,int y,int z){
            a = x;
            b = y;
            c = z;
            parameter = a+b+c;
            s= parameter / 2 ;
            area = Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
        }
        public static void main(String[] args) {
            Triangle myobj = new Triangle(); //calling defauit variables from other file
            Triangle2 myobj1 = new Triangle2(myobj.a,myobj.b,myobj.c);
            System.out.println("Parameter:"+myobj1.parameter);
            System.out.println("Area:"+myobj1.area);
        }
    }  

