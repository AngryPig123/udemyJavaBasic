package DesignPatterns.FactoryPattern.Factory1;

public class CircleFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }

}
