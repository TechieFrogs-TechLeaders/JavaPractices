import java.util.Scanner;

public class MultipleTable {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value");
        int n= scan.nextInt();
        int mul = 0;
        for(int i=1; i<=n; i++){
        mul =n*i;
       
        
        System.out.println( n+" "+"*"+i+" " +"= " +mul);
        scan.close();


    }
    
}
}
