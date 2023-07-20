public class Enhancedswitch {
    public static void main(String[] args){
        int number=10;
        switch(number){
            case 1,2,3:
            System.out.println(" number equals to 10");
            break;
            case 4,5,10:
            System.out.println(" number not equals to 10");
            break;
            default:
            System.out.println("nothing matched");
        }

    }
    
}



//switch with arrows
    class Enhanced {
    public static void main(String[] args){

        int number=50;
        switch(number){
            case 20,30->System.out.println(" number equals to 20");
            case 40,50->System.out.println(" number not equals to 20");
            case 60 ->System.out.println("sixety");
        default ->System.out.println("nothing matched");

            }

        }
    }


        
        
