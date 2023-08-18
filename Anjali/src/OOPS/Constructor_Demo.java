package OOPS;

public class Constructor_Demo {
    int x;
    public Constructor_Demo(){
        x=10;
    } 
    public static void main(String[] args) {
        Constructor_Demo myObj = new Constructor_Demo(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x);
}
}
