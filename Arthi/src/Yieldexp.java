//switch as an expression
public class Yieldexp{
    public static void main(String args[]){
        int m=10;
        int a= switch(m+10){
        case 10,13,14:
        System.out.println("equal to m");
        yield 10;
        case 11:
        System.out.println("not equal to m");
        yield 20;
        default:
        System.out.println("Arthi");
        yield 1;
        };
    }
}

    