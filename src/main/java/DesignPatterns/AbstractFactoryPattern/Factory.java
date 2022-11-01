package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.ColorPakage.Color;
import DesignPatterns.AbstractFactoryPattern.ShapePakage.Shape;

public class Factory {

    private Shape shape;
    private Color color;

    protected Factory(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public void getInfo() {
        shape.draw();
        color.fill();
    }

}
