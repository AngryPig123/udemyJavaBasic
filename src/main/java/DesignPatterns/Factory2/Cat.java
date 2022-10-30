package DesignPatterns.Factory2;

public class Cat implements Animal{
    @Override
    public String sound() {
        return "냐옹";
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
