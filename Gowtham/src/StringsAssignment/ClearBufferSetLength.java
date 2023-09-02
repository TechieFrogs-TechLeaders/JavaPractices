package StringsAssignment;

public class ClearBufferSetLength {   //13
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("This is a StringBuffer.");

        // Clear the StringBuffer using setLength(0)
        stringBuffer.setLength(0);

        // Print the cleared StringBuffer
        System.out.println("Cleared StringBuffer: " + stringBuffer.toString());
    }
}
