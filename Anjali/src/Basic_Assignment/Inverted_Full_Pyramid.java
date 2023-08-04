package Basic_Assignment;
//24.Inverted full pyramid using *
//for decreasing it is better to use decreasing outer loop
public class Inverted_Full_Pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

       
    }
    
}
