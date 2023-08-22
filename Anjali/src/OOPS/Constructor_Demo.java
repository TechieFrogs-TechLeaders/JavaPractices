package OOPS;

public class Constructor_Demo {
    int x;
    String s;
    int y , z;
    Constructor_Demo(){ //no argument consuructor
        x=10;
        System.out.println("Default constructor");
        System.out.println(s+" "+y+" "+z);
    } 
    
    public static void main(String[] args) {
        Constructor_Demo myObj = new Constructor_Demo(); //default constructor is created when obj is created it is used for default values
        System.out.println(myObj.x);
        System.out.println(myObj.s+" "+myObj.y+" "+myObj.z);
}
}
