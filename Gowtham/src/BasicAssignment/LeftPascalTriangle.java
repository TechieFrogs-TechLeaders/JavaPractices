package BasicAssignment;

public class LeftPascalTriangle 
{
    public static void main(String[] args)
    {
     int r=8;
    for(int i=1;i<=r;i++){
         for(int j=0;j<r-1;j++){
         System.out.print(" ");
        }
       for(int k=0;k<i;k++){
        System.out.print("*");
         }
        System.out.println();
         }
        for(int i=1; i<=r-1;i++){
        for(int j=0;j<i;j++){
        System.out.print(" ");
        }
        for(int k=0;k<r-i;k++){
        System.out.print("*");
        }
        System.out.println();
        }
    }
}
   

    




   

