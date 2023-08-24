package OOPS.Inheritence;

class PurchaseItem {
   // private String name;
    private double unitPrice;

    public PurchaseItem(String name, double unitPrice) {
        //this.name = name;
        this.unitPrice = unitPrice;
    }

    public double getPrice() {
        return unitPrice;
    }
}

class WeighedItem extends PurchaseItem {
    private double weight;

    public WeighedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * weight;
    }
}

class CountedItem extends PurchaseItem {
    private int quantity;

    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * quantity;
    }
}

 class Challenge {
    public static void main(String[] args) {
        WeighedItem weighedItem = new WeighedItem("Apples", 2.5, 3.0);
        CountedItem countedItem = new CountedItem("Bottles of Water", 1.0, 5);

        System.out.println("Weighed Item: " + weighedItem.getPrice());
        System.out.println("Counted Item: " + countedItem.getPrice());
    }
}