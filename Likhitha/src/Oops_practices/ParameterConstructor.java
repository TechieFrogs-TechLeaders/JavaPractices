package Oops_practices;

public class ParameterConstructor {
   int i;
    String str;
    int rollNo;
    String name;
    ParameterConstructor(){
        i =10;
        str="Discuss";
        System.out.println("In constructor");
    }
    ParameterConstructor( int rollNo,String name){
       this.rollNo = rollNo;
       this.name = name;
        System.out.println("In Parameter Constructor");
    }
    ParameterConstructor(String name,int rollNo){
    }
    ParameterConstructor(float f,boolean b){

    }
    ParameterConstructor(int rollNo,String name,int marks){

    }
   
    void display() {
        System.out.println(i+ " " +str+ " " +rollNo+ " " +name);
    }
        public static void main(String[] args) {
        ParameterConstructor cPara = new ParameterConstructor();
        cPara.i=12;
        cPara.str="Done";
        cPara.display();
        //System.out.println(cPara.i+ " " +cPara.str);
        ParameterConstructor cPara1 = new ParameterConstructor();
        cPara1.i=15;
        cPara1.str="Completed";
        cPara.display();
       // System.out.println(cPara1.i+ " " +cPara1.str);
        int rollNo=10;
        String name="Full work";
        ParameterConstructor cPara2 = new ParameterConstructor(20,"Full sign");
        System.out.println(cPara2.i+ " " +cPara2.str);
       ParameterConstructor cPara3 = new ParameterConstructor(name,rollNo);
        cPara3.display();
        // System.out.println(cPara3.rollNo+ " " +cPara3.name);
        }
    }

        