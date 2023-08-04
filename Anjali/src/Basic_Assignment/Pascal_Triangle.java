package Basic_Assignment;

//28.Right Pascal's Triangle
public class Pascal_Triangle {
    public static void main(String[] args) {
        
    
    int n=8;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    int m=7;
    for(int x=1;x<=m;x++){
        for(int y=m;y>=x;y--){
            System.out.print("* ");
        }
        System.out.println();
    }
    
}
}

