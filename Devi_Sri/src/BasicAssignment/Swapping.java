package BasicAssignment;

public class Swapping {
    public static void main(String[] args) {

        float n1 = 1.25f, n2 = 2.45f;

        System.out.println("**Before swap**");
        System.out.println("First number = " + n1);
        System.out.println("Second number = " + n2);

        // Value of n1 is assigned to temporary
        float temporary = n1;

        // Value of n2 is assigned to n1
        n1 = n2;

        // Value of temporary (which contains the initial value of n1) is assigned to n2
        n2= temporary;

        System.out.println("**After swap**");
        System.out.println("First number = " + n1);
        System.out.println("Second number = " + n2);
    }
}
    

