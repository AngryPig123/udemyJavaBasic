package DesignPatterns.Factory3;

public class SingleFactoryShape {

    public SingleShape getSingleShape(ShapeInfo shapeType) {
        if (shapeType == ShapeInfo.CIRCLE) {
            return new SingleCircle();
        }
        if (shapeType == ShapeInfo.RECTANGLE) {
            return new SingleRectangle();
        }
        if (shapeType == ShapeInfo.SQUARE) {
            return new SingleSquare();
        }
        throw new NullPointerException();
    }

}
