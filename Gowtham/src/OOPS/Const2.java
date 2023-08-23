package OOPS;

class Const2{  
    int id;  
    String name;    
    Const2(int i,String n){  
    id = i;  
    name = n;  
    }   
    void display(){
        System.out.println(id+" "+name);
    } 
    public static void main(String args[]){   
    Const2 s1 = new Const2(333,"max");  
    Const2 s2 = new Const2(369,"chiru");   
    s1.display();  
    s2.display();  
   }  
}  