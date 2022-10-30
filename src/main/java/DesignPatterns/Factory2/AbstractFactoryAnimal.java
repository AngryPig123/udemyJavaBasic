package DesignPatterns.Factory2;

public abstract class AbstractFactoryAnimal {

    protected abstract Animal getFactoryAnimal();

    public Animal getAnimalInfo() {
        return getFactoryAnimal();
    }

}
