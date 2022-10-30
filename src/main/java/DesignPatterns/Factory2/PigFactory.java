package DesignPatterns.Factory2;

public class PigFactory extends AbstractFactoryAnimal {

    @Override
    protected Animal getFactoryAnimal() {
        return new Pig();
    }
}
