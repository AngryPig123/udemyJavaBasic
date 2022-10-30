package DesignPatterns.Factory3;

public class SingleRectangle implements SingleShape{
    @Override
    public void draw() {
        System.out.println("Hi Factory Pattern!!! I'm Rectangle");
    }
}
