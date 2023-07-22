package BasicAssignment;

public class Palindrome {
    public static void main(String[] args) {
        int n = 121,reminder,reverse=0,temp;
        temp = n;
        while(n!=0){
        
           reminder = n%10;
           reverse =(reverse*10) + reminder;
             n =n/10;
        }
      if( temp ==reverse){
        {
            System.out.print("it is a pallindrom");
        }
    }else{
        System.out.println("not a palindrom");
    }
}
}
    

