package DesignPatterns.Factory;

public class CircleFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }

}
