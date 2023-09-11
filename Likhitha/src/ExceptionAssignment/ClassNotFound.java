package ExceptionAssignment;

public class ClassNotFound {
    public static void main(String[] args) {
        try{
            Class.forName("NonExistentClass");
          }
          catch(ClassNotFoundException ee){
            System.out.println(ee);
    }
    }
}
