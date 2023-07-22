public class Ifelsestattement {
    public static void main (String[] args){
        int num=18;
        int year=2002;
        int i=10;
         if (num % 2  == 0) {
            System.out.println("even number");//even number
        }
            else{
                System.out.println("odd number");
            }
        if ((year %4 ==0 && year % 100 !=0)  || year %400 ==0){//normal year
            System.out.println("leap year");
        }
        else{
            System.out.println("normal year");
        }
        if(i<15){
            System.out.println(true);//true
        }
        else{
            System.out.println(false);
        }
        
         
        

        }
        
    }
    

