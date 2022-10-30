package DesignPatterns.Factory3;

public class Client {
    public static void main(String[] args) {
        new SingleFactoryShape().getSingleShape(ShapeInfo.CIRCLE).draw();
        new SingleFactoryShape().getSingleShape(ShapeInfo.RECTANGLE).draw();
        new SingleFactoryShape().getSingleShape(ShapeInfo.SQUARE).draw();

    }
}
