package Class_Obj_Assignment;

public class Rectangle {
    
        private double length;
        private double breadth;
        private double area;
    
        // Constructor to initialize length and breadth
        public Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth; 
        }
    
        // Method to calculate and return the area
        public double calculateArea() {
            return area = length * breadth;
        }
            public static void main(String[] args) {
            Rectangle rectangle1 = new Rectangle(4, 5);
            Rectangle rectangle2 = new Rectangle(5, 8);
    
            rectangle1.calculateArea();
            rectangle2.calculateArea();
    
            System.out.println("Area of rectangle 1: " + rectangle1.area);
            System.out.println("Area of rectangle 2: " + rectangle2.area);
        }
    }   
    

