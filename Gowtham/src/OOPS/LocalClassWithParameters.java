package OOPS;

public class LocalClassWithParameters {
    public void greet(final String name) {
        class Greeting {
            void sayHello() {
                System.out.println("Hello, " + name + "!");
            }
        }

        Greeting greeting = new Greeting();
        greeting.sayHello();
    }

    public static void main(String[] args) {
        LocalClassWithParameters example = new LocalClassWithParameters();
        example.greet("Gowtham");
    }
}