package BasicAssignment;

public class SandGlass {
    public static void main(String[] args) {
       int g=10;
        for(int i=g;i>=1;i--){
            for(int j=1;j<=g-i;j++){
                System.out.print(" ");
            }
            for(int x=1;x<=i*2-1;x++){
                System.out.print("*");
            }
          System.out.println();  
        }
        int r= 10;
        for(int i=1;i<=r;++i){
           for(int j=1;j<=r-i;++j){
               System.out.print(" ");
           }
           for(int k=1;k<=i*2-1;k++){
            System.out.print("*");
           }
           System.out.println();
   
       }
    }
}
