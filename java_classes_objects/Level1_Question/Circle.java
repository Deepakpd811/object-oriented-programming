package Level1_Question;

public class Circle {
    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI* radius * radius;
    }

    public double calculateCircumference() {
        return 2 * PI* radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    

    @Override
    public String toString() {

        return "radius " + this.radius;
       }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        // circle.display();
        System.out.println(circle.toString());
    }
}
