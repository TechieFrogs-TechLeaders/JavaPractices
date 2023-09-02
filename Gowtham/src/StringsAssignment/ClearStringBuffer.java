package StringsAssignment;

public class ClearStringBuffer {
    
    public static void main(String[] args) {   //12
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");

        // Clear the StringBuffer
        stringBuffer.setLength(1);
        System.out.println("Cleared StringBuffer: " + stringBuffer.toString());
        stringBuffer.setLength(0);

        // Print the cleared StringBuffer
        System.out.println("Cleared StringBuffer: " + stringBuffer.toString());
    }
}
