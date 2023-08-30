package OOPS.Interface;

interface Fastfood {    //5
   
    void Preparing();
    void serving();
}

 class Sandwich implements Fastfood {
    private String delivering;

    public Sandwich(String delivering) {
        this.delivering = delivering;
    }

    public void Preparing() {                                     //overriding
        System.out.println("Preparing the sandwich with " + delivering);
    }

    public void serving() {                                       //overriding
        System.out.println("Serving the sandwich with " + delivering);
    }

    public static void main(String[] args) {
        Sandwich mySandwich = new Sandwich("Care");
        mySandwich.Preparing();
        mySandwich.serving();
    }
}