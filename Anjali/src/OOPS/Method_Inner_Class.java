package OOPS;

public class Method_Inner_Class { //method local inner classes
    private int b = 9;
    static String s = "Hello";
    private void myMethod(){
        System.out.println("Private method");
    }
        public void display(){
           int num = 23;
            class Inner{ //only default ,abstract and final
              static int a = 6; 
              public void print() {
                 System.out.println("This is method inner class "+num +" "+a + " "+b+" "+s);
                 myMethod();
             // }
             // public static void main(String[] args) {
              //  System.out.println("main method"  +Inner.a);
           }
           }
           Inner obj = new Inner();
           obj.print();
           System.out.println(Inner.a);
        }
        public static void main(String args[]){
           Method_Inner_Class outer = new Method_Inner_Class();
           outer.display();
           //Inner myObj = new Inner();
           System.out.println();
          // System.out.println(obj.num); //cannot accecc the class inside of the method out side
        }
     }

