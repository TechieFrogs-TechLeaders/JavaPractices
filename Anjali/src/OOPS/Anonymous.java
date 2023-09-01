package OOPS;


    abstract class Anonymous{  
        int a = 9;
        static int b = 89; 
        final float f = 7f;
        abstract void eat(); 
        void myMethod(){
            System.out.println("mymethod");
        }
      }  
      class TestAnonymousInner{  
        void myMain(){
            System.out.println("class method");
        }
       public static void main(String args[]){  
        int r = 7;
        Anonymous p=new Anonymous(){  
        void eat()
        {
            System.out.println("nice fruits" +a+"  "+b);
        }  
        };  
        Anonymous p1 = new Anonymous() {

            @Override
            void eat() {
                System.out.println("Food"+a+"  "+f);
            }
            
        };
        p.eat(); 
        p1.eat(); 
        p.myMethod();
        System.out.println(p1.a+" "+r);
        TestAnonymousInner myObj = new TestAnonymousInner();
        myObj.myMain();
       }  
      }   

