public class StringObjectsUsingOperators {
     
    private String s;
    private String s1;

    public static void main(String[] args) {
    String s ="Hello";
    String s1 ="Hello";
    String s2 ="World";
        StringObjectsUsingOperators cObj = new StringObjectsUsingOperators();
        cObj.s="Hello";
        StringObjectsUsingOperators cObj1 = new StringObjectsUsingOperators();
        cObj.s1="Come";
        System.out.println(s.equals(cObj.s));
        System.out.println(cObj.s1.equals(s1));

    }

}
