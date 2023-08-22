package OOPS.OOPs_Assignment;
public class Add_dis {          //11
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
            Add_dis myobj = new Add_dis();
            myobj.addDistances(5,12 , 3, 10);
    }
}