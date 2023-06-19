package less_OOP_07_Decorator_Factory_Observer;



interface Shape {
    double getArea();
}

class Square {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }
}

class RectangleAdapter implements Shape {
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public double getArea() {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

public class less_oop_07_seminar_adapter2 {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(3, 4);

        Shape squareAdapter = new RectangleAdapter(square);
        Shape rectangleAdapter = new RectangleAdapter(rectangle);

        System.out.println("Square area: " + squareAdapter.getArea());
        System.out.println("Rectangle area: " + rectangleAdapter.getArea());
    }
}



