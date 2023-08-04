public class Enhanced_Switch_Arrows {
    public static void main(String[] args) {
         /*  switch("Bye"){
            case "Hi"->System.out.println("Hi");//no need to use break here
            case "Hello"->System.out.println("Hello");
            case "Bye","World"->{
            System.out.println("Bye");
            System.out.println("World");}
            default->System.out.println("No value matches");

            }*/
        
        int num=switch(30){
            case 20->{
                System.out.println("The value is 20");
                yield 1;}
            case 40,10 ->{
                System.out.println("The value is 40");
                yield 2; 
            }       
            default->{
                System.out.println("No matching value");
                yield 3; }      
        };
        System.out.println("The value of num:"+num);
    }
}

