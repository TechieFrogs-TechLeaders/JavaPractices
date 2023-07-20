package BasicAssignment;

public class Invertedhalif {
    public static void main(String[] args) {
        int stu=5;
        for (int i=1; i <= stu; ++i) {
            for (int j=stu; j>=i; --j) {
                System.out.print(" *");
            }
            System.out.println();
           }
        }
    }

 