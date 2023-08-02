package BasicAssignment;

public class DiamondStar 
{
    public static void main(String[] args) 
    {
        int r=9;      //rows=9
        for(int i=1;i<=r;i++){    //for rows
            for(int j=1;j<=r-i;j++){    // for column
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        int g=8;
        for(int x=g;x>=1;x--){
            for(int y=1;y<=g-x+1;y++){
                System.out.print(" ");
            }
            for(int z=1;z<=x*2-1;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
