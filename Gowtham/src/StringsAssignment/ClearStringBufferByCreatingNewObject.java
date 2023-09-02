package StringsAssignment;

public class ClearStringBufferByCreatingNewObject {   //14
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("This is a StringBuffer.");

        // Create a new StringBuffer object to clear the content
        StringBuffer newStringBuffer = new StringBuffer();

        // Print the cleared StringBuffer
        System.out.println("Original StringBuffer: " + stringBuffer.toString());
        System.out.println("Cleared StringBuffer: " + newStringBuffer.toString());
    }
}