package OOPS.Redo;

import java.util.Scanner;
public class Complex {
    private double real;
    private double imaginary;

    // Constructor to initialize real and imaginary parts
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to calculate and print the sum of two complex numbers
    public void calculateAndPrintSum(Complex other) {
        double sumReal = this.real + other.real;//other place holder it telts the second num
        double sumImaginary = this.imaginary + other.imaginary;
        System.out.println("Sum: " + sumReal + " + " + sumImaginary + "i");
    }

    // Method to calculate and print the difference of two complex numbers
    public void calculateAndPrintDifference(Complex other) {
        double diffReal = this.real - other.real;
        double diffImaginary = this.imaginary - other.imaginary;
        System.out.println("Difference: " + diffReal + " + " + diffImaginary + "i");
    }

    // Method to calculate and print the product of two complex numbers
    public void calculateAndPrintProduct(Complex other) {
        double prodReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double prodImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
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

        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        complex1.calculateAndPrintSum(complex2);
        complex1.calculateAndPrintDifference(complex2);
        complex1.calculateAndPrintProduct(complex2);

        scanner.close();
    }
}
