package Oops_practices;

public class Encapsulation {
    
        private int num = 10;
        private String s= "Hello";
        boolean b = false;
    
        public void setNum(int num) {
            this.num = num;
        }
    
        public void setS(String s) {
            this.s = s;
        }
    
        public void setB(boolean b) {
            this.b = b;
        }
    
        public String getS() {
            return s;
        }
    
        public boolean getB() {
            return b;
        }
    
        public int getNum(){
            return num;
        } 
    
        private int myMethod(){
            System.out.println("my method");
            return num;
        }
    
        public int secondMethod(int b){
            System.out.println("Hello");
            return  num = b;
        }
        Encapsulation(){
            System.out.println("In Constructor");
        }
        public static void main(String[] args) {
            Encapsulation myobj = new Encapsulation();
            System.out.println(myobj.num +" "+myobj.s+" "+myobj.b);
            myobj.myMethod();
        } 
    }
    

