public class Enhanced3 {
    public static void main(String[] args) {
        int i = 15;
        int m = switch(i){
            case 5,10,20:
            System.out.println("value is given number");
             yield 5;
             case 15:
             System.out.println("value is 15");
             yield 12;
             default:
             System.out.println("in default");
             yield 0;
        };
        System.out.println("my value is m");
        System.out.println(m);
    }

        
    

