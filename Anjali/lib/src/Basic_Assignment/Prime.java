package Basic_Assignment;

//14.Prime Number Program in Java
public class Prime {
    public static void main(String[] args) {
        int num=37;
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
                //System.out.println("in loop");
            }
        }//After completion of for loop completely this if is checked
        //System.out.println("in");
        if(count==2)//Since a prime number is divisible by only two num 1,itself so count==0
            System.out.println(num+":is Prime Number");
        else
            System.out.println(num+":Is not prime");    
    }
    
}
