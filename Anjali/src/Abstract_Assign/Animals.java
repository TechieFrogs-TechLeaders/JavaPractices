package Abstract_Assign;

abstract public class Animals {
    abstract void cats();

    abstract void dogs();
}

class Cats extends Animals{
    void cats(){
        System.out.println("Cats meow");
    }
    void dogs(){

    }

}
class Dogs extends Animals{
    void dogs(){
        System.out.println("Dogs bark" );
    }
    void cats(){

    }
    public static void main(String[] args) {
        Cats myCats = new Cats();
        Dogs myDogs = new Dogs();
        myCats.cats();
        myDogs.dogs();
    }
}
