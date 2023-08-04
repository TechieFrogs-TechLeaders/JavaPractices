public class Variables{
    //This is Static or Class variable
    static int a=40;
    static
    {
        a=30;
    }
    //static cannot be written inside main method because it is static
    static final int z;
    //Static initialization block
    static
    {
        z=20;
    }
    int y=50; 
    public static void main(String[] args) {
        //This is Local variable
        int x=100;
        //this is final keyword if want to use block it should be blank
        final int y;
        //instance initialization block
        {
            y=40;
        }
       
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}