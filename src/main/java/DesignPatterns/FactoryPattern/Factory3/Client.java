package DesignPatterns.FactoryPattern.Factory3;

import static DesignPatterns.FactoryPattern.Factory3.SingleFactoryShape.getSingleShape;

public class Client {
    public static void main(String[] args) {
        SingleShape singleShape2 = getSingleShape(ShapeInfo.CIRCLE);
        SingleShape singleShape1 = getSingleShape(ShapeInfo.RECTANGLE);
        SingleShape singleShape = getSingleShape(ShapeInfo.SQUARE);
    }
}