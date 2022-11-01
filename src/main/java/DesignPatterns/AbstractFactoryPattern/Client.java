package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.ColorPakage.ColorType;
import DesignPatterns.AbstractFactoryPattern.ShapePakage.ShapeType;

import static DesignPatterns.AbstractFactoryPattern.AbstractFactory.*;

public class Client {

    public static void main(String[] args) {

        getFactory(ShapeType.CIRCLE, ColorType.GREEN).getInfo();
        System.out.println();

        getFactory(ShapeType.CIRCLE, ColorType.RED).getInfo();
        System.out.println();

        getFactory(ShapeType.RECTANGLE, ColorType.RED).getInfo();
        System.out.println();

        getFactory(ShapeType.RECTANGLE, ColorType.GREEN).getInfo();
        System.out.println();

    }

}
