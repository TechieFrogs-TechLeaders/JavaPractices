package StringsAssignment;

public class ArrayCopy {   
    public static void main(String[] args) {
        char[] copyFrom={'d','e','c','f','a','e','f','i','n','a','t','e','d','a'};
        char[] copyTo=new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(String.valueOf(copyTo)); 
    }
}
