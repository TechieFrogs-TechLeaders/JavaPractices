package BasicAssignment;

public class FloydTriangle {
    public static void main(String[] args) {
        int r=4,n=1;
        for(int i=1; i<=r ;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n + " ");
                ++n;
                 }
                 System.out.println();
        }
    }
}
