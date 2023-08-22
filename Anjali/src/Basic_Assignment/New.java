package Basic_Assignment;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        System.out.println("Enter the num:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem,result=0,temp;
        temp=num;
        while(num!=0){
            rem=num%10;
            result+=rem*rem*rem;
            num=num/10;

        }
        if(result==temp){
            System.out.println("The num is armstrong:"+temp);

        }else{
            System.out.println("The num is not Armstrong:"+temp);
        }
        sc.close();
    }
    
}
