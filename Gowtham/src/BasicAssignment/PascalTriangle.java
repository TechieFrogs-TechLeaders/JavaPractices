package BasicAssignment;

public class PascalTriangle {
    public static void main(String[] args) {
        int r=4,e=1;
        for(int i=0;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                if(k==0 || i==0)
                e=1;
                else 
                e=e*(i-k+1)/k;
                System.out.print(e+ " ");
            }
            System.out.println();
        }
    }
}
