package Basic_Assignment;

//15.Palindrome Program in Java
public class Palindrome {
    public static void main(String[] args) {
    int num=151,temp,rev=0,rem;
    temp=num;
    while(num!=0){
        rem=num%10;//1 //5  //1
        rev=rev*10+rem;//1  //15 //151
        num=num/10;//151/10=15  //1
    }
    if(temp==rev){
        System.out.println(rev+":Is an Palindeome ");

    }
    else{
        System.out.println(rev+":Not a Palindrome");
    }

    char

    
}
}