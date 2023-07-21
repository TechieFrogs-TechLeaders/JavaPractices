package Classpratice;
public class ControlStatements {
    public static void main(String[] args) {
        int age=18;
        int weight=100;
        if(weight>60){
            System.out.println("weight is greater than 60");
        }
        
        if(weight>70){
            System.out.println("weight is less than 100"); } 
            else{
                System.out.println("weight is greater than 100");
            }
            // if-else ladder example.
            if(weight<60){
                System.out.println("underweight");
            }
            else if(weight>=60 && weight<75){
                System.out.println("balanced weight");
            }
            else if(weight>=75 && weight<85){
                System.out.println("overweight");
            }
            else if(weight>=85 && weight<95){
                System.out.println(" obese");
            }
            else if(weight>=95 && weight<105){
                System.out.println("super obese");
            }
            else if(weight>=45 && weight<60){
                System.out.println("skinny");
            }
            //nested-if statement example.
            if(age>=18){
                if(weight<80){
                    System.out.println("you are healthy");
                }
                else{
                    System.out.println("you are not healthy");
                }
            }
    }
}
