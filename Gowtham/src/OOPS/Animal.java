package OOPS;

abstract class Animal {
    abstract void sounds();
    void sleep(){
        System.out.println("Animal is sleeping");
        System.out.println();
    }
}
class Dog extends Animal{
    void sounds(){
        System.out.println("woof woof");
    }
} 
class Cat extends Animal{
    void sounds(){
        System.out.println("meow meow");
    }
}
class Snake extends Animal{
    void sounds(){
        System.out.println("hiss hiss");
    }
}
class AnimalAbstract{
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        Snake snake=new Snake();
        dog.sounds();
        dog.sleep();

        cat.sounds();
        cat.sleep();

        snake.sounds();
        snake.sleep();
        
    }
}