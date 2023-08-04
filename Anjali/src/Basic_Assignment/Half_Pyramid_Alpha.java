package Basic_Assignment;

//19.Program to print half pyramid using alphabets
public class Half_Pyramid_Alpha {
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                
            }
            ch++;
            System.out.println();
        }
    }
    
}
