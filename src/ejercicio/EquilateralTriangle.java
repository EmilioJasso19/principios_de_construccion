package ejercicio;

public class EquilateralTriangle extends GeometricShapes {

    public EquilateralTriangle() {
    }

    public EquilateralTriangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double calculatePerimeter() {
        return super.getHeight() * 3;
    }

    @Override
    public double calculateArea() {
        return super.calculateArea() / 2;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "\n\theight: " + getHeight() +
                "\n\twidth: " + getWidth() +
                "\n}";
    }
}
