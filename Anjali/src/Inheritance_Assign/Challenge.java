package Inheritance_Assign;

 class PurchaseItem {
    private String name;
     private double unitPrice;
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
   
    public PurchaseItem(String name,double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public double getPrice(){
        return unitPrice;
    }


}

    class WeighedItem extends PurchaseItem{
        private double weight;
        public WeighedItem(String name,double unitPrice,double weight){
            super(name, unitPrice);
            this.weight = weight;
        }

        public double getPrice(){
        return super.getPrice() * weight;
    }
    }
    class CountedItem extends PurchaseItem{
        private int quantity;
        public CountedItem(String name,double unitPrice,int quantity){
            super(name,unitPrice);
            this.quantity = quantity ;
        }
        public double getPrice(){
        return super.getPrice() * quantity;
    }
    }
public class Challenge{
    public static void main(String[] args) {
        WeighedItem weighedItem = new WeighedItem("Apples", 1.5, 2.5);
        CountedItem countedItem = new CountedItem("Books", 10.0, 3);
        
        System.out.println("Weighed Item:");
        System.out.println("Name: " + weighedItem.getName());
        System.out.println("Price: " + weighedItem.getPrice());
        
        System.out.println("\nCounted Item:");
        System.out.println("Name: " + countedItem.getName());
        System.out.println("Price: " + countedItem.getPrice());
    }
}    