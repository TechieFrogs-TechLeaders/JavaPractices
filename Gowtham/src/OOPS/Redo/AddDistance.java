package OOPS.Redo;

public class AddDistance {
    public void AddDis(int feet1, int inches1, int feet2, int inches2){
        int totalInches1= feet1*12+inches1;
        int totalInches2= feet2*12+inches2;
        int sumTotalInches =totalInches1 + totalInches2;
        System.out.println(sumTotalInches);
        int newFeet=sumTotalInches/12;
        int newInches=sumTotalInches%12;
        System.out.println("total distance: "+ newFeet+" feet "+newInches+" inches ");
    }
    public static void main(String[] args) {
        AddDistance obj=new AddDistance();
       obj.AddDis(3, 05, 04, 05);
    }    
}
