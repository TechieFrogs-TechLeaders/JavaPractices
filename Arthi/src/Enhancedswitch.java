public class Enhancedswitch{
    public static void main(String args[]){
        int number=109;
        switch(number){
            case 1,2,3 :
                System.out.println("It is not equal to 109");
                break;
            case 109,4:
                System.out.println("It is equal to 109");
                break;
        default:
        System.out.println("nothing matched");
               
        }
    }
}
//yield to return a value
class Switch{
    public static void main(String args[]){
        int value=30;
        switch(value){
            case 10,20:
            yield 1;

            case 30,40:
            yield 2;
        }


    }
}
//switch as an expression
class Switchexp{
    public static void main(String args[]){
        int m=10;
        int res=switch(m+2){
        case 12,13,14:
        System.out.println("equal to m");
          yield 10;
        case 11:
        System.out.println("not equal to");
    }
}
}
//switch with arrows
class Switcharrows{
    public static void main(String args[]){
        int number=1;
        switch(number){
            case 1,2,3->
                System.out.println("It is not equal to 109");
                
            
            case 109,4 ->
            System.out.println("It is equal to 109");

        }
    }
}





    

    

