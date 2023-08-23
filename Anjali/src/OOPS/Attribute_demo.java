package OOPS;

import Method_Assign.Area_Square_Rectangle;

public class Attribute_demo {
    int x;
    public static void main(String[] args) {
        
        Attribute_demo myobj=new Attribute_demo();
        myobj.x=30;
        System.out.println(myobj.x);


        //from method_assign folder
        Area_Square_Rectangle myarea = new Area_Square_Rectangle();
        System.out.println(Area_Square_Rectangle.i); //Static
        System.out.println(myarea.s); //public
    }
}
