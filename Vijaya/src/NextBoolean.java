import java.util.Scanner;
public class NextBoolean{
    public static void main(String[] args){
        Scanner Scanobj = new Scanner(System.in);
        System.out.println("java is a programming language");
        System.out.println("enter your answer");
        Boolean answer;
        answer = Scanobj.nextBoolean();
        System.out.println("answer is "+ answer);
        Scanobj.close();
    }
}
    

