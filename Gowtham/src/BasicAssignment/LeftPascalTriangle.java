package BasicAssignment;

public class LeftPascalTriangle 
{
    public static void main(String[] args)
    {
     int r=10;
    for(int i=1;i<=r;i++){
        for(int j=1;j<=r-i;j++){
         System.out.print(" ");
        }
       for(int k=1;k<=i;k++){
         System.out.print("*");
        }
          System.out.println();
    }
    int s=9;
    for(int x=s; x>=1;x--){
        for(int y=1;y<=s-x+1;y++){
         System.out.print(" ");
        }
        for(int z=1;z<=x;z++){
          System.out.print("*");
        }
        System.out.println();
    }
    }
}
   

    




   

