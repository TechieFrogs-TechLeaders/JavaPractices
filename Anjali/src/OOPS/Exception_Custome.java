package OOPS;

class InvaliedAgeException extends RuntimeException{
  InvaliedAgeException( String mes){
        super(mes);
    }
} 

class CustomeException extends Exception{
    CustomeException(){

    }
}

public class Exception_Custome {
    public static void main(String[] args) {
        int age = 12;

        try{
            if( age < 18){
            throw new InvaliedAgeException("The person is not eligible to vote if his age is less than 18");
        }
       }
        catch( InvaliedAgeException ie){
           System.out.println(ie);
            age = 23;

       }

        try{
            throw new CustomeException();
        }
        catch(CustomeException ce){
            System.out.println("Caught the exception"); 
            System.out.println(ce.getMessage());
            System.out.println(ce);
            ce.printStackTrace();
        }
    }
}
