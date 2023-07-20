public class Switch2 {
    public static void main(String[] args) {
        int age = 21;
        switch (age) {
    case 1:
         System.out.println("You are under 16");
         break;

    case 2:
         System.out.println("You are eligible for marriage now");
         break;
    case 3: 
         System.out.println("You are over age");
         break;

    default:
         System.out.println("Invalid age");
         break;
        }
    }
}
