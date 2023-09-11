package Oops_practices;

 public class Encapsulationexample {
 private int i = 20;
 private String name = "World";
 //acceccesors / getters
 public int getI(){
    return i;
 }
 //setters /mutators /modifiers
 public void setI(int k){
    i = k;
 }
    

 

 public static void main(String[] args) {
    Encapsulationexample cObj = new Encapsulationexample();
    System.out.println(cObj.i+   " " +cObj.name);
 }
}

