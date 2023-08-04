package Basic_Assignment;

//20.Inverted half pyramid using *
public class Inverted_Half_Pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=8;i++){
            for(int j=8;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
