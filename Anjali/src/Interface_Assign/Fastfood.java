package Interface_Assign;

 interface Fastfood {
   
    void prepare();
    void serve();
}

 class Sandwich implements Fastfood {
    private String filling;

    public Sandwich(String filling) {
        this.filling = filling;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing the sandwich with " + filling);
    }

    @Override
    public void serve() {
        System.out.println("Serving the sandwich with " + filling);
    }

    public static void main(String[] args) {
        Sandwich mySandwich = new Sandwich("Care");
        mySandwich.prepare();
        mySandwich.serve();
    }
}

