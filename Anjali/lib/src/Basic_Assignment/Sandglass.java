package Basic_Assignment;

//30.Sandglass Star Pattern
public class Sandglass {
    public static void main(String[] args) {
    int n=10;
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    int m=10;
    for(int x=1;x<=m;x++){
        for(int y=1;y<=n-x;y++){
            System.out.print(" ");
        }
        for(int z=1;z<=x;z++){
            System.out.print("* ");
        }
        System.out.println();
    }

    
}
}
