package Method_Assign;

class Degree{
    public void getDegree(){
        System.out.println("I got a Degree");
    }
}
class Undergraduate{
    public void getDegree(){ //override
        System.out.println("I got a Undergraduate");
    }
}
class Postgraduate{ 
    public void getDegree(){ //override
        System.out.println("I got a Postgraduate");
    }
}

public class Degree1 {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Undergraduate undergraduate = new Undergraduate();
        Postgraduate postgraduate = new Postgraduate();
        degree.getDegree();
        undergraduate.getDegree();
        postgraduate.getDegree();

}
}