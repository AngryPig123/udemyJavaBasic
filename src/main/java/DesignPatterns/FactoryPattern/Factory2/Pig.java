package DesignPatterns.FactoryPattern.Factory2;

public class Pig implements Animal {
    @Override
    public String sound() {
        return "꿀꿀";
    }

    @Override
    public int foot() {
        return 4;
    }

    @Override
    public boolean cute() {
        return true;
    }
}
