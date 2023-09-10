package ExceptionHandling_Assogn;

interface extracur{
    void newMethod();
}

class Stud implements extracur{
    int a = 5;
    public Stud() throws InstantiationException{
        throw new  InstantiationException();
    }
    public static void main(String[] args) throws InstantiationException {
        Stud obj = new Stud();
        System.out.println(obj.a);
        
    }
    @Override
    public void newMethod() {
        throw new UnsupportedOperationException("Unimplemented method 'newMethod'");
    }
    
}


 