package DesignPatterns.FactoryPattern.Factory3;

public class SingleCircle implements SingleShape{
    @Override
    public void draw() {
        System.out.println("Hi Factory Pattern!!! I'm Circle");
    }
}