// Interface defining multiple methods
interface Shape {
    void draw();    // Method to draw the shape
    void erase();   // Method to erase the shape
}

// Implementation of Shape interface for Circle
class Circle implements Shape {
    // @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    // @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

// Implementation of Shape interface for Rectangle
class Rectangle implements Shape {
    // @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    // @Override
    public void erase() {
        System.out.println("Erasing Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();        // Creating Circle object
        Shape rectangle = new Rectangle(); // Creating Rectangle object
        
        // Calling draw and erase methods polymorphically
        circle.draw();
        circle.erase();
        
        rectangle.draw();
        rectangle.erase();
    }
}
