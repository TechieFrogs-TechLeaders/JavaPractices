package Inheritance_Assign;

 class Apple {
    int number_of_items;
    public Apple(int number_of_items) {
        this.number_of_items = number_of_items;
    }
}
class Banana extends Apple{
    int number_of_items_banana;
   
    public Banana(int number_of_items,int number_of_items_banana){
        super(number_of_items);
        this.number_of_items_banana = number_of_items_banana;
    }
    public void show(){
        System.out.println("number_of_items:"+number_of_items);
        System.out.println("number_of_items_banana:"+number_of_items_banana);
    }
}

public class Apple1{
    public static void main(String[] args) {
        Banana myBanana = new Banana(3, 05);
        myBanana.show();
    }
}
