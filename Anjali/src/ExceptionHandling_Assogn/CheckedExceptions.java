package ExceptionHandling_Assogn;


class AgeOutOfBoundException extends IllegalArgumentException{
    AgeOutOfBoundException(String s){
        super(s);
    }
}

public class CheckedExceptions {
    public static void main(String[] args) {
        int age = -34;
        if(age < 0){
            throw new AgeOutOfBoundException("Age cannot be negitive value");
        }
        


    }
}
