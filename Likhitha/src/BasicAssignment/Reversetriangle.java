package BasicAssignment;

public class Reversetriangle {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--) {
        for (int s=1;s<=5-i;s++) {
            System.out.print(" ");
        }
        for (int j=i;j<=i*2-1;j++) {
           System.out.print(" *");
        }
           System.out.println();

         }
        }
    }

