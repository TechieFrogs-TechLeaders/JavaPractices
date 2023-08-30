package OOPS;

public interface Greeting {
    default void display(){
        System.out.println("default");
    }
    void greet();
}
class AnonymousEX{
    public static void main(String[] args) {
        Greeting anonymousGreeting=new Greeting() {
            public void greet(){
                System.out.println("Hello from the anoymous class!");
            }
        
        };
        anonymousGreeting.greet();
        anonymousGreeting.display();
    }
}
