package Interface_Assign;

public interface Shape {
    boolean fitsText(String text);
}

class Circle implements Shape{
    double radius;
    String color;

    Circle(double radius , String color){
        this.radius = radius;
        this.color = color;
    }

    public boolean fitsText(String text){
        return text.length()  < radius ;
    }
}

class Rectangle implements Shape{
    int length;
    int with;
    String color;
    Rectangle(int length , int width , String color){
        this.length = length;
        this.with = width;
        this.color = color;
    }
    public boolean fitsText(String text){
        return text.length() < length;  
    }
}

 class Sign {
    private Shape background;
    private String text;

    public Sign(Shape background, String text) {
        this.background = background;
        this.text = text;
    }

    public boolean fitsText() {
        return background.fitsText(text);
    } 

    

    public static void main(String[] args) {
        Circle myCircle = new Circle(67, "Pink");
        System.out.println(myCircle.fitsText("Hello World"));

        Rectangle myRectangle = new Rectangle(67, 43, "Blue");
        System.out.println(myRectangle.fitsText("This is a rectangle"));
    }
}
