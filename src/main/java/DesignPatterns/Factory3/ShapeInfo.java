package DesignPatterns.Factory3;

public enum ShapeInfo {
    CIRCLE("CIRCLE"), RECTANGLE("RECTANGLE"), SQUARE("SQUARE");

    private final String name;

    private ShapeInfo(String s) {
        this.name = s;
    }

}
