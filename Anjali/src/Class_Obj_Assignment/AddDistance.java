package Class_Obj_Assignment;

public class AddDistance {
    /*private int feet;
    private int inches;

    // Constructor to initialize distance
    public AddDistance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Method to add two distances
    public void addDistances(AddDistance other) {
        int totalInches = (feet * 12 + inches) + (other.feet * 12 + other.inches);
        int newFeet = totalInches / 12;
        int newInches = totalInches % 12;
        System.out.println("Total distance: " + newFeet + " feet " + newInches + " inches");
    }

    public static void main(String[] args) {
        AddDistance distance1 = new AddDistance(5, 8);
        AddDistance distance2 = new AddDistance(3, 10);

        distance1.addDistances(distance2);
    }*/
    public  void addDistances(int feet1, int inches1, int feet2, int inches2) {
        int totalInches1 = feet1 * 12 + inches1;
        int totalInches2 = feet2 * 12 + inches2;
        int sumTotalInches = totalInches1 + totalInches2;
        System.out.println(sumTotalInches);
        int newFeet = sumTotalInches / 12; //Quo
        int newInches = sumTotalInches % 12; //reminder

        System.out.println("Total distance: " + newFeet + " feet " + newInches + " inches");
    }

        public static void main(String[] args) {
            AddDistance myobj = new AddDistance();
            myobj.addDistances(5,8 , 3, 10);
           /*  int feet1 = 5;
            int inches1 = 8;

            int feet2 = 3;
            int inches2 = 10;

        AddDistance.addDistances(feet1, inches1, feet2, inches2);*/
    }
}
