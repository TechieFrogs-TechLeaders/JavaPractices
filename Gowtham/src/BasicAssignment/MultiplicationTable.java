package BasicAssignment;
// Program to Generate Multiplication Table using for or while loop
public class MultiplicationTable {
    public static void main(String[] args) {
        int a=9;
        System.out.println("9th table");
        for(int i=1;i<=11;++i){
            System.out.println(a*i);
        }
        int b=7,i=1;
         System.out.println("7th table:");
        while(i<=19){
            System.out.println(b*i);
            i++;
        }

    }
    
}
