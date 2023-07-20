package BasicAssignment;

public class RightPascalTriangle 
{
    public static void main(String[] args)
    {
        int r=8;
        for(int i=0;i<=r-1;i++)
        {
             for(int j=0;j<=i;j++)
            {
             System.out.print("*"+" ");
            }
             System.out.println();
        }
        for(int i=r-1;i>=0;i--)
        {
             for( int j=0;j<=i-1;j++)
             {
                System.out.print("*"+ " ");
             }
             System.out.println();
        }
    }
}
