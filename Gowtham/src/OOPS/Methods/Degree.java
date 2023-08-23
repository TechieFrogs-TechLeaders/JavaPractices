package OOPS.Methods;

class Degree {
    public void getDegree() {
        System.out.println("I got a Degree");
    }
}

class Undergraduate extends Degree {
    public void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    public void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

class Qualification {
    public static void main(String[] args) {
        Degree obj1 = new Degree();
        Undergraduate obj2 = new Undergraduate();
        Postgraduate obj3 = new Postgraduate();
        obj1.getDegree();
        obj2.getDegree();
        obj3.getDegree();
    }
}