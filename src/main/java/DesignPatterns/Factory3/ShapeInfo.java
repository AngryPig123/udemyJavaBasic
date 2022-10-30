package DesignPatterns.Factory3;

public enum ShapeInfo {
    CIRCLE("CIRCLE"), RECTANGLE("RECTANGLE"), SQUARE("SQUARE");


    private final String shape;

    ShapeInfo(String shape) {
        this.shape = shape;
    }

    public String shape() {
        return shape;
    }


}
