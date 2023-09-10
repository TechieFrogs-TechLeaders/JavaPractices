package ExceptionAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionHandling {
  public static void main(String[] args) {
        CheckedExceptionHandling demo = new CheckedExceptionHandling();
        try {
            demo.readFile("example.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    public void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw e; 
        }
    }
}
