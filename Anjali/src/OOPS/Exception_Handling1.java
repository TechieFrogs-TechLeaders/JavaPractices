package OOPS;

public class Exception_Handling1 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9};
        String str = "abd12";
        String str1 = "54789";
        int num2 = Integer.parseInt(str1);
        System.out.println("The parseint conversion : "+num2);
        String str2 = "Hello World";
       
        try{
            
            try{
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
        catch(NumberFormatException ne){
            System.out.println(ne);
            int num = Integer.parseInt(str1);
            System.out.println("String : "+ num);
        }
        try{
            System.out.println("Arry: "+ arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
            System.out.println("Modified index : "+arr[3]);
        }
        try{
            System.out.println(str2.charAt(11));
        }
        catch(StringIndexOutOfBoundsException se){
            System.out.println(se);
            System.out.println(se.getMessage());
            //se.printStackTrace();
            System.out.println(str2.charAt(3));
        }
        }
        catch(Exception ex){
            System.out.println(ex);
            
        }
        
        
        
        
    }
}
