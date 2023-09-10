package OOPS;

//unchecked exceptions
public class Exception_HandelingThrowNew {
    
    public static void main(String[] args) {
        int age = -3;
        //"IllegalArgumentException" 
        //It is typically thrown to indicate that a method has been passed an argument that it doesn't accept or that is outside the 
        //acceptable range of values. In other words, it signals that the input to a method is invalid or inappropriate.
        
            if( age < 0){
                throw new IllegalArgumentException("Age cannot be negative :");
        }
     }
}

//IllegalStateException
// indicate that an object is in an illegal or inappropriate state to perform a particular operation. 
//In other words, it signals that a method cannot be executed because the conditions for its execution are not met.
class IllegalState1{
    private int value = 0;
    void increment(){
            value ++;
        }

        void decrement(){
            if( value == 0){
                throw new IllegalStateException("cannot be decremented below zero.");
                
            }
        }
        public static void main(String[] args) {
            IllegalState1 obj = new IllegalState1();
        try {
            obj.decrement();
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException caught: " + e.getMessage());
        }
        }
}
