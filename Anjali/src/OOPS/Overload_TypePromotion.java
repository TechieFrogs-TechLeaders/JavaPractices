package OOPS;

public class Overload_TypePromotion {
    public void myMethod(){
        System.out.println("Hello");
    }
    
    public int myMethod(int a){ //in method overloading the data type of the method does not need to same as the variables 
        return a;
    }

    void myMethod(int a , long b){
        System.out.println(a+"  "+b); 
    }
     void myMethod(int a , long b , int c){
        System.out.println(a+"  "+b+ "  "+c);
    }
    public static void main(String[] args) {
        Overload_TypePromotion myobj = new Overload_TypePromotion();
        myobj.myMethod(30,30);
        myobj.myMethod(50,20,10);//type Promotion long higher level data type took lover level data type int
    }

}
