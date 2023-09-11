package package_one;

//import Oops_practices.Chaining;
import package_name.ClassOne;
import package_name.ClassTwo;

public class Mag {
    int a=10;
    void display(){
    }
    public static void main(String[] args) {
        ClassOne cOne = new ClassOne();
        
        System.out.println(cOne.y);
        ClassTwo cTwo = new ClassTwo();
        System.out.println(cTwo.x);
    }
}




