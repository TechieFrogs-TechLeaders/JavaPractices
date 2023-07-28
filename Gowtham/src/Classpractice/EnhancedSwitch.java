package Classpractice;
public class EnhancedSwitch {
    public static void main(String[] args) {
        int n=35;
        int k= switch(n) {
            case 2,5:
            System.out.println("5");
                yield 5;
            case  10, 15:
            System.out.println("15");   
                 yield 10;
            case 20,25:
            System.out.println("25");
              yield 20;
            case 33,35:
            System.out.println("35");
                  yield 30;
          default:System.out.println("none");
          yield 0;      
        
        };
        System.out.println(""+k);
    
        
    }
}

