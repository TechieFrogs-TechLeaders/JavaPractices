package BasicAssignment;

public class Gcd {
    public static void main(String[] args) {
        int a=95 , b=75;
        while(a!=b) {
            if (a==0) {
                System.out.println("Gcd" +b );
            if (b==0) {
                System.out.println("Gcd" +a);
            }
            if (a>b) {
                a=a-b;
            if (a<b) {
                b=b-a;
            }
            if (a==b) {
                System.out.println("Gcd" +a);
            }
            }
            }
            }

            }
        }

    

