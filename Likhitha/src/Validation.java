import java.util.Scanner;
 
public class Validation {
    public static void main(String[] args) {
 
        String s = "Ding!";
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()) {
            System.out.print(" " + scanner.hasNextInt());
 
            System.out.print("  " + scanner.next() + "\n");
        }

        scanner.close();
    }
}
