package Method_Assign;

public class New {
    static void myMethod(){
        System.out.println("This is a static method");
        New myNew = new New();
        myNew.userDefinedMethod();
    }
    void userDefinedMethod(){
        System.out.println("User defined method");
        //myMethod();
        //System.out.println("Calling a method from another ");
        New myNew = new New();
        System.out.println( myNew.methodDemo());
    }
    public String methodDemo(){
        return "This is return type";
       //New myNew = new New();
        //myNew.userDefinedMethod();  anything written after return is unrechable code
    }
    public static void main(String[] args) {
        double area= Area_Square_Rectangle.area_Square_Rectangle(4,7);
        System.out.println("The static method from other class:"+area);

        Area_Square_Rectangle myarea = new Area_Square_Rectangle();
        //Calling method from another class
        int areaofsquare = myarea.area_Square_Rectangle(10); 
        System.out.println("The area of Square: "+areaofsquare);
        System.out.println (Area_Square_Rectangle.i); //withclass name static variable
        System.out.println(myarea.s); //public
        //System.err.println(myarea.num); //not visible private

        New myNew = new New();
        myMethod();
        myNew.userDefinedMethod();
        System.out.println(myNew.methodDemo());

    }
}
