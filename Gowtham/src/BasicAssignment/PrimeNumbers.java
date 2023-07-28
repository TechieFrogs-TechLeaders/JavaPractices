package BasicAssignment;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n=20,p=0;
        for(int i=1;i<=100;i++){
            if(n%i==0){
                p++;
            }
        }
        if(p==0)
        System.out.println(n+" : is a prime number");
        else
        System.out.println(n+" : is not a prime number");
    }

}
