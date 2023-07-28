package BasicAssignment;

public class ArmStrong {
    public static void main(String[] args) {
        int n = 183;
        int r,sum=0,temp=n;
     while(n>0)
     {
        r = n%10;
        sum=sum+r*r*r;
        n=n/10;
     }
    if (temp== sum)
        System.out.println("it is a armstrong");
    else
        System.out.println("not a armstrong");
}
}      