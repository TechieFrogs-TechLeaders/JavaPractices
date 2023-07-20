package BasicAssignment;

public class PyramidNumbers {
    public static void main(String[] args) {
        int r=5,k=0,p=0,p1=0;

        for(int i=1; i<=r; ++i) {
            for(int j=1;j<=r-i;++j){
                System.out.print(" ");
                ++p;
            }
            while(k != 2 * i - 1) {
                if(p <= r - 1){
                System.out.print((i+k)+ " ");
                ++p;
                }
                else{
                ++p1;
                System.out.print((i+k-2*p1)+ " ");
            }
                ++k;
        }
        p1 = p = k =0 ;
        System.out.println();
    }
}
}