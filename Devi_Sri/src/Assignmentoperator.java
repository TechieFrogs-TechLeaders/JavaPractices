public class Assignmentoperator {
    public static void main (String[]  args){
        int a=10;
        int b=20;
        short c=15;
        short d=25;
        float e=20.5f;
        float f=39.46f;
        char g='d';
        char h='s';

        f+=28.5;//f=f+28.5=67.96
        e-=20.5;//e=e-20.5=0
        a+=8;//a=a+8
        b-=9;//b=b-9
        c+=d;//c=c+d
        System.out.println(a);//18
        System.out.println(b);//11
        System.out.println(a+b);//29
        System.out.println(a-b);//7
        System.out.println(a*b);//198
        System.out.println(a%b);//7
        System.out.println(a/b);//1
        System.out.println(c+d);//65
        System.out.println(f+e);//67.96+0
        System.out.println(e-f);//0-67.96
        System.out.println(g-h);//100-115=-15
        System.out.println(h+g);//115+100=215

    }
    
}
