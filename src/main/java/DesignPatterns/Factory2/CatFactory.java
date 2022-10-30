package DesignPatterns.Factory2;

public class CatFactory extends AbstractFactoryAnimal{

    @Override
    protected Animal getFactoryAnimal() {
        return new Cat();
    }
}
