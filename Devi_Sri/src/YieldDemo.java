public class YieldDemo{
    public static void main(String[] args){
         int a=switch(10){
         case 1:
            System.out.println("ten shouldbe printed");
            yield 100;
            case 10:
            System.out.println(11);
            yield 2;
            default:
            yield 10;
         };
         System.out.println(a);
            
}
           
    
}





    class Yield{
    public static void main(String[] args){
         int n=20;
         int a=switch(20){
         case 20,2:
            System.out.println("laptop");
            yield 5;
            case 10,1:
            System.out.println("desktop");
            yield 2;
            default:
            System.out.println("mobile");
            yield 10;
        };
    
}
           
    
}


//switch used as expression
class Switchexpression{
    public static void main(String[] args){
        String s="devisri";
        String a=switch("devisri"){
        case "devisri" :
        System.out.println("water");
        yield  "n";
        case "tarun" :
        System.out.println("chair"); 
        yield " m";       
        case "arthi" :
        System.out.println("bench") ;
        yield "v";
        default:
        yield "nothing matched";
        };
        }
    }