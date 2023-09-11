package package_one;

import package_name.ClassTwo;

public class New {
    int x = 45;
    public static void main(String[] args) {
        ClassTwo myTwo = new ClassTwo();
        System.out.println(myTwo.x);
    }
}
