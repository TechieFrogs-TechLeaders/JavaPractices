package String_Assign;

public class ClearStringBufferWithObj {
    
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");

        System.out.println("Original StringBuffer: " + stringBuffer);

        // Clear the StringBuffer by using or assigning new StringBuff() obj
        stringBuffer = new StringBuffer();

        System.out.println("Cleared StringBuffer: " + stringBuffer);
    }
}
