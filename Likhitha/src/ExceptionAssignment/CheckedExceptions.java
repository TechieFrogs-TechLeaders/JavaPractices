package ExceptionAssignment;

    
import java.io.*;
import java.util.*;
public class CheckedExceptions {

 

    public static void main(String[] args)
        throws FileNotFoundException
    {
 
        FileInputStream textfile = null;
 
        try {
            textfile = new FileInputStream(
                
                 Scanner sc = new Scanner(textfile);
 
                while (sc.hasNextLine())
                    System.out.println(sc.nextLine());
        }
 
        // Catch block to handle exceptions
        catch (FileNotFoundException e) {

            System.out.println("File does not exist");
        }
    }
}

