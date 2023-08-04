package Basic_Assignment;

//8.Java Program to Find Factorial of a Number 
public class Factorial {
    public static void main(String[] args) {
        int a=6;
        long fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
            System.out.println("values of a in each iteration :"+fact);

        }
        System.out.println("Factorial value of a :"+fact);

       /*  {
        System.out.println("For while loop");    
        int b=8;
        long factorial=1;    
        int r=1;
        while(r<=b)
        {
            factorial=factorial*r;
            System.out.println("values in each iteration :"+factorial);
            r++;
        }
    }*/
    }
    
}
