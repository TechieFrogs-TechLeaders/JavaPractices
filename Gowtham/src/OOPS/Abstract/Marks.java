package OOPS.Abstract;

abstract class Marks {
  abstract double getPercentage();  
}
class A extends Marks{
    private double subject1;
    private double subject2;
    private double subject3;

    A(double s1,double s2,double s3){
        subject1=s1;
        subject2=s2;
        subject3=s3;
    }
    double getPercentage(){
        return (subject1+subject2+subject3)/3;
    }
}
class B extends Marks{
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    B(double s1,double s2,double s3,double s4){
        subject1=s1;
        subject2=s2;
        subject3=s3;
        subject4=s4;
    }
    double getPercentage(){
        return (subject1+subject2+subject3+subject4)/4;
    }
}
class MarksDem{
    public static void main(String[] args) {
         A studentA = new A(85, 90, 78);
        B studentB = new B(92, 88, 76, 95);
        
        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}