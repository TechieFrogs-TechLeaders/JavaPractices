public class condition_if_else_demo {
    static int age=43;
    public static void main(String[] args) {
        if(age>=18)
            System.out.println("can vote");
        else
             System.out.println("cannot vote");
        
        
        int num=0;     
        if(num>0)
            System.out.println("it is a positive num");
        else
            System.out.println("it is a negative num");
            
        String name="lucy";
        if(name!="pavan")
            System.out.println("Not her name");
        else
            System.out.println("Its her name");
        
            //long    
        long l=99999999999999999l;
        if(l>=3333333333l)
            System.out.println("it is long datatype");
        else
            System.out.println("It is diff Datatype");
        
            //double
        double d=7.6;
        if(d!=6.5)
             System.out.println("it is not d");
        else
            System.out.println("it is d");
            
        //char
        char ch='X';
        if(ch==88)
        {
            System.out.println("It is ch");
        }
        else
            System.out.println("it is not ch");     
    }
    
}
