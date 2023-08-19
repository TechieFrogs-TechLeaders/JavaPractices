

public class Pattern1_Alpha {

    public static void main(String[] args) {
        char character='A';
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(character);
                character++;
            }
            System.out.println();
        }
        

    }
}