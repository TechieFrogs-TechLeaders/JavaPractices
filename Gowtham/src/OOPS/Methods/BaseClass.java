package OOPS.Methods;

class BaseClass {
    protected int i;

    public void printNum() {
        System.out.println("Value of i: " + i);
    }
}

class SubClass extends BaseClass {
    private int j;

    public void setValues(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void printNum() {
        System.out.println("Value of j: " + j);
    }
}

class values {
    public static void main(String[] args) {
        SubClass subObj = new SubClass();
        subObj.setValues(5, 10);
        subObj.printNum();
    }
}
