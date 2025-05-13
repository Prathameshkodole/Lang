interface Shape {
    // Abstract methods (no implementation)
    double getArea();
    double getPerimeter();
    String getName(); // Added getName() for better illustration
}

// Class implementing the Shape interface
class Circle implements Shape {
    private double radius;
    private String name;

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Class implementing the Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;
    private String name;

    public Rectangle(double length, double width, String name) {
        this.length = length;
        this.width = width;
        this.name = name;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

     @Override
    public String getName() {
        return name;
    }
}

// Main class to demonstrate interface usage
public class Exp4 {
    public static void main(String[] args) {
        // Create objects of classes that implement the Shape interface
        Circle circle = new Circle(5, "Circle");
        Rectangle rectangle = new Rectangle(4, 6, "Rectangle");

        // Create an array of Shape objects.  This is possible because both
        // Circle and Rectangle implement the Shape interface.
        Shape[] shapes = new Shape[2];
        shapes[0] = circle;
        shapes[1] = rectangle;

        // Iterate through the array and use the interface methods
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getName());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("--------------------");
        }
    }
}
