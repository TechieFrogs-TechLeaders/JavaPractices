package String_Assign;

public class ClearStringBufferWithSetLength {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello,World!");

        System.out.println("Original StringBuffer: " + stringBuffer);

        stringBuffer.setLength(0);

        System.out.println("Cleared StringBuffer: " + stringBuffer);
    }
}
