package Basic_Assignment;

//10.Java Program to Generate Multiplication Table using for or while loop
public class Multiplication_Table {
    public static void main(String[] args) {
        int a=10;
        int n=2;
        int mul=0;
        for(int i=1;i<=a;i++){
            mul=n*i;
            System.out.println("for each iteration mul value : " +n+" "+"*"+i+" "+" =" +mul);
        }

        {
            int b=6;
            for(int j=1;j<=b;j++){
                System.out.println("for each iteration mul value : " +b+" "+"*"+j+" "+" =" +b*j);

            }
        }
    }
    
}
