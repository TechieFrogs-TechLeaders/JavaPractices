package OOPS;

import Interface_Assign.Local_Class;

public class ANew {
    
    void innerMethod(){
       class MyClass implements Local_Class{
            int y = 4;
            static float f = 4.5f;
            final int z = 89; 
            public void myMethod(){
                System.out.println("Local method");
            }
           
            static void newMethod(){
                System.out.println("Static method");
                class StaticClass{ //can write non static local class in static method
                    int v = 5;
                    void static_Method(){
                        System.out.println("Static local inner class ");
                    }
                }
                StaticClass staObj = new StaticClass();
                staObj.static_Method();
            }
            
            abstract class Local_Class {
               abstract  void abstract_Method();
                public void local_Method(){
                    System.out.println("Local class method");
                }
            }
            Local_Class myLocal_Class = new Local_Class(){

                @Override
                void abstract_Method() {
                    System.out.println("Abstract method");
                }
                
            };
            
           // myLocal_Class.local_Method();
       }
       MyClass myObj = new MyClass();
       myObj.myMethod();
       myObj.myLocal_Class.abstract_Method();
       
       
       class InnerClass extends MyClass {
            int x = 45;
            InnerClass(){
                System.out.println("Local Inner class constructor");
                class ConClass{
                    void conMethod(){
                        System.out.println("Constructor local class");
                    }
                }
                ConClass obj1 = new ConClass();
                obj1.conMethod();
            }
            void display(){
                System.out.println(x+" "+y+" "+z+" "+f);
                myMethod();
                MyClass.newMethod();
            }
       }
       
       
       InnerClass myClass = new InnerClass();
       myClass.display();
    }
    public static void main(String[] args) {
        ANew myInner_Class = new ANew();
        myInner_Class.innerMethod();
       // StaticClass.Static_Method();
    }


}
