package OOPS.Inheritence;

class Apple {
    int number_of_items;

    Apple(int number_of_items) {
        this.number_of_items = number_of_items;
    }
}

class Banana extends Apple {
    int number_of_items;

    Banana(int appleItems, int bananaItems) {
        super(appleItems);
        this.number_of_items = bananaItems;
    }

    void show() {
        System.out.println("Number of items in Apple: " + super.number_of_items);
        System.out.println("Number of items in Banana: " + number_of_items);
    }
}

class AppBan {
    public static void main(String[] args) {
        Banana banana = new Banana(5, 8);
        banana.show();
    }
}