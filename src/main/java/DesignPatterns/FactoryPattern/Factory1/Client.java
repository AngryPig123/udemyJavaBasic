package DesignPatterns.FactoryPattern.Factory1;

public class Client {

    public static void main(String[] args) {
        Shape shape = new RectangleFactory().getShape();
        shape.draw();
    }

}
