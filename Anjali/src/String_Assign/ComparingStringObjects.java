package String_Assign;

public class ComparingStringObjects {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = "hello";

        String string4 = new String("Hello");

        System.out.println("literal same string: "+ string1 == string2);

        System.out.println("literal diff string: "+ string1 == string3);

        System.out.println("obj same value: "+ string2 == string4);

        System.out.println("Obj diff value : " + string4 == string3);

}
}
