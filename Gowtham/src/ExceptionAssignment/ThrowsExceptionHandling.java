package ExceptionAssignment;

import java.io.IOException;

public class ThrowsExceptionHandling {
     static void checkAge(int age) throws ArithmeticException, IOException, IllegalArgumentException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else if (age >= 18 && age < 21) {
            throw new IOException("Access denied - You must be at least 21 years old for certain privileges.");
        } else if (age >= 21 && age < 25) {
            throw new IllegalArgumentException("Access denied - You must be at least 25 years old for additional privileges.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) throws IOException {
        try {
            checkAge(15);
        } catch (ArithmeticException | IOException | IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}