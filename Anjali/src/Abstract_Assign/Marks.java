package Abstract_Assign;

abstract public class Marks {
    abstract double getPercentage();
}
class ClassA extends Marks{
    double result1 , result2 , result3 ;
    ClassA(double result1 , double result2 , double result3){
        this.result1 = result1;
        this.result2 = result2;
        this.result3 = result3;
    }
    double getPercentage(){
        return (result1 + result2 + result3 ) / 3.0;
    }
}
class ClassB extends Marks{
    double result1 , result2 , result3 , result4;
    ClassB(double result1 , double result2 , double result3 , double result4){
        this.result1 = result1;
        this.result2 = result2;
        this.result3 = result3;
        this.result4 = result4;
    }
    double getPercentage(){
        return (result1 + result2 + result3 + result4) / 4.0;
    }
    public static void main(String[] args) {
        ClassA objA = new ClassA(34, 56, 67);
        ClassB onjB = new ClassB(67, 67, 34, 78);
        System.out.println("Percentage of Student A: " + objA.getPercentage());
        System.out.println("Percentage of Student B: " + onjB.getPercentage());
    }
}

