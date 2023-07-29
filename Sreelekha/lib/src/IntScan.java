import java.util.Scanner ;
public class IntScan{
    public static void main(String[] args){
        Scanner Scanobj= new Scanner(System.in);
        System.out.println("Enter Value ");
        int num1 = Scanobj.nextInt();
        int num2 = Scanobj.nextInt();
        int sum= num1+num2;
        System.out.println("sum of values:" +sum);
        Scanobj.close();
        


    }

}

    

