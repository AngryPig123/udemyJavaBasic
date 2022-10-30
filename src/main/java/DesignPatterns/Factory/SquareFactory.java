package DesignPatterns.Factory;

public class SquareFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Square();
    }

}
