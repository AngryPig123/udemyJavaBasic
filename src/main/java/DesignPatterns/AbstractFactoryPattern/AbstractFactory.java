package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.ColorPakage.Color;
import DesignPatterns.AbstractFactoryPattern.ColorPakage.ColorType;
import DesignPatterns.AbstractFactoryPattern.ColorPakage.Green;
import DesignPatterns.AbstractFactoryPattern.ColorPakage.Red;
import DesignPatterns.AbstractFactoryPattern.ShapePakage.Circle;
import DesignPatterns.AbstractFactoryPattern.ShapePakage.Rectangle;
import DesignPatterns.AbstractFactoryPattern.ShapePakage.Shape;
import DesignPatterns.AbstractFactoryPattern.ShapePakage.ShapeType;

public class AbstractFactory {

    public static Factory getFactory(ShapeType shape, ColorType color) {
        return new Factory(getShape(shape), getColor(color));
    }

    private static Shape getShape(ShapeType shape) {
        switch (shape) {
            case RECTANGLE:
                return new Rectangle();
            case CIRCLE:
                return new Circle();
            default:
                throw new IllegalStateException("Unexpected value: " + shape);
        }
    }

    private static Color getColor(ColorType color) {
        switch (color) {
            case RED:
                return new Red();
            case GREEN:
                return new Green();
            default:
                throw new IllegalStateException("Unexpected value: " + color);
        }
    }

}
