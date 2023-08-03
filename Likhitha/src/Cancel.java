import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cancel {
        public static void main(String[] args) throws IOException {
        //int i;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter  value");
       int N = Integer.parseInt(bufferedReader.readLine().trim());
    
      
       for(int i=1;i<=10;i++) { 
          
       System.out.println(N +  " * "  + i + " = "   + N * i);
       }
       bufferedReader.close();
    }
   
}
