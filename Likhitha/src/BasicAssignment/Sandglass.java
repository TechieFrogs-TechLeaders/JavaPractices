package BasicAssignment;

public class Sandglass {
    public static void main(String[] args) {
        for (int i=5;i>0;i--){
            for(int j=5-i;j>=1;j--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.println(" ");
            }
               System.out.println();
        }
        for (int i=1;i<=5;i++) {
    for (int j=1;j<=5-1;j++) {
           System.out.println(" ");
         }
        System.out.println();
        }
    }
}
