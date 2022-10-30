package DesignPatterns.Factory3;

public class Client {
    public static void main(String[] args) {
        new SingleFactoryShape().getSingleShape(ShapeInfo.CIRCLE.name()).draw();
        new SingleFactoryShape().getSingleShape(ShapeInfo.RECTANGLE.name()).draw();
        new SingleFactoryShape().getSingleShape(ShapeInfo.SQUARE.name()).draw();
    }
}
