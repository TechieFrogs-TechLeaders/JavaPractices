public class Prime3 {
    public static void main(String[] args) {
        int num=13;
        boolean prime=true;
        for(int i=1; i<=num;i++) {
            if (num%i==0) {
                prime=false;
                break;
            }
                System.out.println(prime);
        }
    }
        
  }

