package BasicAssignment;
public class Inverted {
    public static void main(String[] args) {
    int stu=5;
    for (int i=stu; i >= 1; --i) {
        for (int j=1; j<=i; ++j) {
            System.out.print(j + " ");
        }
        System.out.println();
       }
    }
}