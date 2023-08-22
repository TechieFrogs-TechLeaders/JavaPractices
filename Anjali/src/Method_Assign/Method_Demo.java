package Method_Assign;

public class Method_Demo {
    
    void myMethod(int n, char c){
        System.out.println("int:"+ n +" and "+c);
    }
   void myMethod(char c, int n){
        System.out.println("char:"+c +" and int:"+n);
        
    }
    public static void main(String[] args) {
        Method_Demo myDemo = new Method_Demo();
        myDemo.myMethod(54,'S');
        myDemo.myMethod('y',1);
        
    }
}
