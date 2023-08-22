package Method_Assign;

public class PrintNumber {
    int a;
    float b;
    public int printn(int a){
        return a;
    }
    private float printn(float b){
        return b;
    }
    protected double printn(double a){
        return a;
    }
    int printn(byte c){
        return c;
    }
    public long printn(long l){
        return l;
    }
    protected boolean printn(boolean word){
        return true;
    }
    String printn(String s){
        return s;
    }
    public static void main(String[] args) {
        PrintNumber printobj = new PrintNumber();
        printobj.a = printobj.printn(56);
        System.out.println("The value in int:"+printobj.a);
        //System.out.println(printobj.printn(20));
        printobj.b = printobj.printn(5.6f);
        System.out.println("The float balue:"+printobj.b);
        //System.out.println(printobj.printn(555f));
        double a = printobj.printn(45.9);
        System.out.println("Double value:"+a);
        //System.out.println(printobj.printn(46.8));
        int c = printobj.printn(54); //Since int is larger than byte it can take int
        System.out.println("The byte value:"+c);
        long l = printobj.printn(5555555555555555555l);
        System.out.println("The value long:"+l);
        boolean word = printobj.printn(false);
        System.out.println("The value of Boolean:"+word);
        String s = printobj.printn("Hello World");
        System.out.println("The string value:"+s);
    }
}
