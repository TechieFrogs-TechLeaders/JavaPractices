package OOPS.Inheritence;

class Shape1 {
    public void print() {
        System.out.println("This is shape");
    }
}

class Rectangle_1 extends Shape1 {
    public void print() {
        System.out.println("This is rectangular shape");
    }
}

class Circle_1 extends Shape1 {
    public void print() {
        System.out.println("This is circular shape");
    }
}

class Square_1 extends Rectangle_1 {
    public void print() {
        super.print();
        System.out.println("Square is a rectangle");
    }
    
}

 class Shape_dem {
    public static void main(String[] args) {
        Square_1 square = new Square_1();

        square.print(); 
      //  square.print(); 
    }
}