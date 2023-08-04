import java.util.Scanner;
public class ExamCoding{
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the row");
    int row = sc.nextInt();
    for(int i =1 ;i<=10;i++){
        System.out.println(row +"*"  +i+"="+ row*i);
    }
sc.close();
}
}

