
public class StringBufferUsingLength {
    public static void main(String[] args) {
    
    StringBuffer str1=new StringBuffer("Hello World");
    System.out.println("String length is : "+str1.length()+"\t"+"String  is :"+str1);
    str1.setLength(6);
    System.out.println("Sentence after SetLength :"+str1);
  }
}
