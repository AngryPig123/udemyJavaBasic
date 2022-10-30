package Solid5Principles.InterfaceSegregation;

interface ShapeInterface {
    double area();
}

interface SolidShapeInterface {
    double volume();
}

class Cube implements ShapeInterface, SolidShapeInterface {

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

}
