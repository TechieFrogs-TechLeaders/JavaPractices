package Basic_Assignment;

public class Floyds_Tri {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<=4;i++)//row
        {
            for(int j=1;j<=i;j++){//column
                System.out.print(a+" ");
                a++;
                
            }
            System.out.println();
        }
    }
    
}
