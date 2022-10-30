package DesignPatterns.Factory3;

public class SingleFactoryShape {

    public SingleShape getSingleShape(String shapeType) {

        if (shapeType.equalsIgnoreCase(ShapeInfo.CIRCLE.name())) {
            return new SingleCircle();
        }

        if (shapeType.equalsIgnoreCase(ShapeInfo.RECTANGLE.name())) {
            return new SingleRectangle();
        }

        if (shapeType.equalsIgnoreCase(ShapeInfo.SQUARE.name())) {
            return new SingleSquare();
        }

        throw new NullPointerException();

    }


}
