package Basic_Assignment;

public class Lcm_demo {
    public static void main(String[] args) {
        int num1=120,num2=360,gcd=1;
        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        int lcm=(num1*num2)/gcd;
        System.out.println("The Lcm of num1:"+num1+" "+"num2:"+num2+" is "+lcm);
    }
    
}
