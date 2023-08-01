package Basic_Assignment;

public class Ps_num_Demo {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
                
            }
            System.out.println();
        }
    }
    
}
