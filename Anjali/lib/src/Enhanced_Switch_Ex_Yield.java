public class Enhanced_Switch_Ex_Yield {
    public static void main(String[] args) {
        int num=switch(40){
            case 20,30,50:
                System.out.println("The value is 20");
                yield 1;
            case 3:
                System.out.println("The value is 3");
            case 5:
                System.out.println("The value is 5");
                yield 5;
            case 40:
                yield 4;
                
            default:
                System.out.println("No matching values" );
                yield 5;
            };
            System.out.println("The value of num:"+num); 
    }
    
}
