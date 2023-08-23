package OOPS.Methods;

public class PrintIntegerAndChar {
    public void printIntAndChar(int n, char c) {
        System.out.println("Integer: " + n);
        System.out.println("Character: " + c);
    }

    public void printIntAndChar(char c, int n) {
        System.out.println("Character: " + c);
        System.out.println("Integer: " + n);
    }
    public static void main(String[] args) {
        PrintIntegerAndChar printer = new PrintIntegerAndChar();

        printer.printIntAndChar(5, 'A');
        System.out.println();
        printer.printIntAndChar('B', 10);
    }
}






