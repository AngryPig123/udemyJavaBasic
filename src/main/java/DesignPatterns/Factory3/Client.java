package DesignPatterns.Factory3;

import static DesignPatterns.Factory3.SingleFactoryShape.getSingleShape;

public class Client {
    public static void main(String[] args) {
        getSingleShape(ShapeInfo.CIRCLE).draw();
        getSingleShape(ShapeInfo.RECTANGLE).draw();
        getSingleShape(ShapeInfo.SQUARE).draw();
    }
}