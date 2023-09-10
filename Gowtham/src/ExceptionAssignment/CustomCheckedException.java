package ExceptionAssignment;

public class CustomCheckedException extends Exception {
    private int errorCode;
    public CustomCheckedException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public int getErrorCode() {
        return errorCode;
    }
}
class PassArgumentsWithCheckedException {
    static void performOperation() throws CustomCheckedException {
        int errorCode = 404;
        throw new CustomCheckedException("Custom exception occurred", errorCode);
    }
    public static void main(String[] args) {
        try {
            performOperation();
        } catch (CustomCheckedException e) {
            System.out.println("Custom Checked Exception: " + e.getMessage());
            System.out.println("Error Code: " + e.getErrorCode());
        }
    }
}
    
