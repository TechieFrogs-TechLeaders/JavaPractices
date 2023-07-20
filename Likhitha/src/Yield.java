public class Yield {
    public static void main(String[] args) {
        int num = 18;
        int age = switch (num + 3) {
            case 20,23,24:
                  System.out.print("You are not eligible at this age");
                  yield 1;
            case 22,15,19:
                  System.out.println("You are eligible at this age");
                  yield 2;
            default:
                  System.out.println("Out of range");
                  yield 3;
        };
    }
}
