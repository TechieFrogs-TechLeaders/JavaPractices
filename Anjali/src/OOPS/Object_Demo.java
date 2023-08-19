package OOPS;

public class Object_Demo {
   
        int x = 5, y = 78, z = 56;
        String s = "HEllo world";
        public static void main(String[] args) {
        Object_Demo myObj = new Object_Demo();
        Object_Demo myobj1 =new Object_Demo();
        myobj1.x = 98;
        myobj1.y = 76;
        myobj1.z = 45;
          System.out.println(myObj.x +" "+myObj.y+" "+myObj.z +" "+myObj.s);
          System.out.println(myobj1.x +" "+myobj1.y+" "+myobj1.z);
        }
}
