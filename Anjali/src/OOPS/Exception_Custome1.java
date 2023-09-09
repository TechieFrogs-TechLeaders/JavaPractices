package OOPS;

import java.io.IOException;

public class Exception_Custome1 {
    public static void main(String[] args) throws BalanceNotSufficientException{
        int balance  = 500;
        if( balance < 1000){
            throw new BalanceNotSufficientException("The minimum balance is not sufficient");
        }
    }
}

class BalanceNotSufficientException extends IOException{
    BalanceNotSufficientException(String mew){
        super(mew);
    }
}