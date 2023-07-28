package BasicAssignment;

public class Lcm {
    public static void main(String[] args) {
        int n1=18;
        int n2=15;
        int temp1 = n1;
        int temp2 = n2;
    while(n1!=n2) {
        if (n1>n2) {
            n1=n1-n2;
        }
        else {
            n2=n2-n1;
        }
    }
    int lcm=(temp1*temp2 )/n1;
          System.out.println("Lcm of" + " " + temp1 +  " " +"&&"+ " " +temp2 + " " + "Is" + " " + lcm);
        }
      }
    


