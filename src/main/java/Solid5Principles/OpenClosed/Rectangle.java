package Solid5Principles.OpenClosed;

public class Rectangle implements Shape {

    private double x;
    private double y;

    @Override
    public double calculatorArea() {
        return this.x * this.y;
    }

    public Rectangle() {
        this.x = 0d;
        this.y = 0d;
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}

interface Shape {
    double calculatorArea();
}

class AreaCalculator {
    public double calculatorRectangleArea(Shape shape) {
        return shape.calculatorArea();
    }
}

class Main {

    public static void main(String[] args) {

    }

}



