package BasicAssignment;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        int a= 25, b= 50, c= 18;
        if (a>=b && a>=c)
        System.out.println(a+ "is largest number");
        else if (b>=c && b>=a)
        System.out.println(b+ "is largest number");
        else 
        System.out.println((c+ "is largest number"));

    }
}
