package OOPS;

abstract class Animal_10 {
    abstract void makeSound();
    abstract void eat();
}

class AnonymousAbstractClassExample {
    public static void main(String[] args) {
        Animal_10 animal = new Animal_10() {
            @Override
            void makeSound() {
                System.out.println("The animal makes a sound.");
            }

            @Override
            void eat() {
                System.out.println("The animal is eating.");
            }
        };

        animal.makeSound();
        animal.eat();
    }
}