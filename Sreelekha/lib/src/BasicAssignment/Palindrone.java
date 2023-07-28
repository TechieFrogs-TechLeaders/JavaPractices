package BasicAssignment;

public class Palindrone {
    public static void main(String[] args){
        int n=393,remainder,rev=0,temp;
        temp=n;
        while(n!=0){
            remainder=n%10;
            rev=(rev*10)+remainder;
            n=n/10;
        }
            if(temp==rev){
                {
                System.out.println("it is  palindronre");
            }
        }else{
                System.out.println("it is not palindrone");
            }
        }

    }
    

