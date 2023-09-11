package ExceptionAssignment;

public class NumberFormatException {
    public static void main(String[] args) {
        int a= 8;
        try{
                String s;
                int c = Integer.parseInt(s);
        }catch(NumberFormatException er){
        System.out.println(er);
        er.printStackTrace();
    }
}

    public void printStackTrace() {
    }
}

