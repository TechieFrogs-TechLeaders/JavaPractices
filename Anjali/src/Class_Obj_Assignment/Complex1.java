package Class_Obj_Assignment;

import java.util.Scanner;

public class Complex1 {
    public void calculateAndPrintSum(double real1,double real2,double imaginary1,double imaginary2) {
        double sumReal = real1 + real2;//other place holder it telts the second num
        double sumImaginary = imaginary1 + imaginary2;
        System.out.println("Sum: " + sumReal + " + " + sumImaginary + "i");
    }
    public void calculateAndPrintDifference(double real1,double real2,double imaginary1,double imaginary2) {
        double diffReal = real1 - real2;
        double diffImaginary = imaginary1 - imaginary2;
        System.out.println("Difference: " + diffReal + " + " + diffImaginary + "i");
    }
    public void calculateAndPrintProduct(double real1,double real2,double imaginary1,double imaginary2) {
        double prodReal = (real1 * real2) - (imaginary1 * imaginary2);
        double prodImaginary = (real1 * imaginary2) + (imaginary1 * real2);
        System.out.println("Product: " + prodReal + " + " + prodImaginary + "i");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();

        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();

        Complex1 complex = new Complex1();
        complex.calculateAndPrintSum(real1,real2,imaginary1,imaginary2);
        complex.calculateAndPrintProduct(real1,real2,imaginary1,imaginary2);
        complex.calculateAndPrintDifference(real1, real2, imaginary1, imaginary2);
        scanner.close();
    }
}
