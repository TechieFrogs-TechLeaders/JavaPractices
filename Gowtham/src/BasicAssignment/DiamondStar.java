package BasicAssignment;

public class DiamondStar 
{
    public static void main(String[] args) 
    {
        int r=9,i,j,k;
        for(i=0;i<=r;i++)
        {
            for(j=i;j<(r-1);j++)
            System.out.print(" ");
            for(k=0;k<(i*2)+1;k++)
            System.out.print("*");
            System.out.println();
        }
        for(i=0;i<(r-1);i++)
        {
        for(j=i;j>=0;j--)
            System.out.print(" ");
        for(k=(r*2)-3;k>(i*2);k--)
        System.out.print("*");
        System.out.println();
        }
    }
}
