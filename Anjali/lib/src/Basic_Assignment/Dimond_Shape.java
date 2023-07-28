package Basic_Assignment;

//27.Diamond Shape Pattern

public class Dimond_Shape {
    public static void main(String[] args) {
        int n=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
               System.out.print(" ");
        } 
        for(int k=1;k<=i*2-1;k++){
            System.out.print("*");
        } 
        System.out.println();    
        }
        int w=7;
        for(int x=w;x>=1;x--){
            for(int y=1;y<=w-x+1;y++){
                System.out.print(" ");
            }
            for(int z=1;z<=x*2-1;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
