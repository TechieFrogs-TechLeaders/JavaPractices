package Inheritance_Assign;

 class A {
    int i,j;
    
    public  A(int i, int j) {
        this.i = i;
        this.j = j;
    }
    
    public void show(){
        System.out.println("i:"+i+"  "+" j:"+j);
    }
    
}
class B extends A{
    public int k;
    
    public B(int i,int j,int k){
        super(i,j);
        this.k = k;
    }

    public void show(){
        super.show();
        System.out.println("k :"+k);
    }
}
public class A1 {
    public static void main(String[] args) {
        B objB = new B(1, 2, 3);
        objB.show(); // This will call the overridden show() method in ClassB
    }
}