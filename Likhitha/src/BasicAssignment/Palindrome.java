package BasicAssignment;
    public class Palindrome {
       public static void main(String[] args) {
    String x="abcdedcba";
    int i=0,j=x.length() - 1 ;
    while(i<j) {
        if (x.charAt(i) != x.charAt(j)) {
    {
        System.out.println("Not a palindrome");
        System.out.println(0);
    }
    i++;
    j--;
    }
        } 
      }
    }
