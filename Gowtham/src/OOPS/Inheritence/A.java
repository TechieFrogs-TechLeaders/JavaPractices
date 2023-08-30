package OOPS.Inheritence;

public class A {
    int i;
    int j;
    A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println("i = " + i + ", j = " + j);
    }
}

class B extends A {
    int k;
    B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show() {
        System.out.println("k = " + k);
        super.show();
    }
}

 class over {
    public static void main(String[] args) {
        //A objA = new A(1, 2);
        B objB = new B(3, 4, 5);
      //  objA.show();
        objB.show();
    }
} 
    

