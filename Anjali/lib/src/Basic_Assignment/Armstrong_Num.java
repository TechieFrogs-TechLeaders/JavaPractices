package Basic_Assignment;

public class Armstrong_Num {
    public static void main(String[] args) {
        int num=371,rem,temp,result=0;
        temp=num;
        while(num!=0){ //here we can't use if condition since 
            rem=num%10; //3
            result+=Math.pow(rem,3);  //3^3=27  //5^3=125 //1^3=1
            num=num/10; // 153/10=15
        
        }if(result==temp){
            System.out.println("The number is armstrong num:"+result);
        }
        else{
            System.out.println("not Armstrong");
        }
    }
    
}
