package BasicAssignment;

public class Alphabetpyramid {
    public static void main(String[] args) {
        //char ch='A';
    
         for (int i=1; i<=5;i++) {
            char ch='A';
        //Inner loop
        for(int j=1;j <= i;j++) {
            System.out.print(ch+" ");
            
            ch++;
        }
        System.out.println();
        }
    }
}

