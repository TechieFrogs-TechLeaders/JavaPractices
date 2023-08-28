package Abstract_Assign;

import Interface_Assign.Measurable;

 class Messure_Continue_Interface implements Measurable {
    public void getMeasure(){
        System.out.println("get measure");
    }

    public void getMeasure1(){
        System.out.println("This is Measure_1");
    }

    public void getMeasure2(){
        System.out.println("This is measure_2");
    } 

    public static void main(String[] args) {
        Messure_Continue_Interface myObj = new Messure_Continue_Interface();
        myObj.getMeasure();
        myObj.getMeasure1();
        myObj.getMeasure2();
    }
}
