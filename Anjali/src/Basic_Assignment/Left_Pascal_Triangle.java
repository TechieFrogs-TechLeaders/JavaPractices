package Basic_Assignment;

//29.Left Pascal's Triangle
public class Left_Pascal_Triangle {
    public static void main(String[] args) {
        
    
    int n=10;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    } 
    int m=9;
    for(int x=m;x>=1;x--){
        for(int y=1;y<=m-x+1;y++){
            System.out.print(" ");
        }
        for(int z=1;z<=x;z++){
            System.out.print("*");
        }
        System.out.println();
    }
    
}
}
