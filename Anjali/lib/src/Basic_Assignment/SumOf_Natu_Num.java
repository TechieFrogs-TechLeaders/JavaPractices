package Basic_Assignment;

//9.Java Program to Calculate the Sum of Natural Numbers  
public class SumOf_Natu_Num {
    
    public static void main(String[] args) {
        int a=18;
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+i;
            System.out.println("For each iteration : "+sum);
        }
        System.out.println("Sum of Natural Num: "+sum);

    }
    
}
