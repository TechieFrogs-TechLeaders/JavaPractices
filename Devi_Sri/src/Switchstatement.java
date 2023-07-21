public class Switchstatement {
    public static void main (String[]  args){
        int n=20;
        switch(n){
        case 5:
        System.out.println(5);
        break;
        case 10:
        System.out.println(10);
        break;
        case 15:
        System.out.println(15);
        break;
        case 20:
        System.out.println(20);
        break;
        default:
        System.out.println("not printed");
        }
    }


        }



    class Switch {
    public static void main (String[]  args){
        char ch='G';
        switch(ch){
        case 'A':
        System.out.println("vowel");
        break;
        case 'E':
        System.out.println("vowel");
        break;
        case 'I':
        System.out.println("vowel");
        break;
        case 'o':
        System.out.println("vowel");
        break;
        case 'u':
        System.out.println("vowel");
        break;
        default :{
            System.out.println("consonant");

        }
        }
    }
}



class fallthrough {
    public static void main (String[]  args){
        int number=10;
        switch(number){
        case 5:
        System.out.println(5);
        case 10:
        System.out.println(10);
        case 15:
        System.out.println(15);
        default:
        System.out.println("not in 10,20 and 30");
        }
    }
}





       





        

    
    

