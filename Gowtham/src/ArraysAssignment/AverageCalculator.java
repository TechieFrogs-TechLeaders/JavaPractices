package ArraysAssignment;

public class AverageCalculator {
    public static void main(String[] args) {
        double[] numbers = { 5.5, 7.2, 10, 4.1, 6.7 };
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.println("The average is: " + average);
    }
}
