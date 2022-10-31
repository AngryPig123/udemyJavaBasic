package DesignPatterns.FactoryPattern.Factory2;

public class PigFactory extends AbstractFactoryAnimal {

    @Override
    protected Animal getFactoryAnimal() {
        return new Pig();
    }
}
