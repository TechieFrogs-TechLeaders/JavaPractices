package ExceptionHandling_Assogn;

public class HandlingClassNotFoundException {
    public static void main(String[] args) {
        String className = "NonExistentClass";

        try{
            System.out.println(Class.forName(className));
        }
        catch( ClassNotFoundException ce){
            ce.printStackTrace();
        }
    }
}
