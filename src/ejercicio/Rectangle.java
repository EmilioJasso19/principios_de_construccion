package ejercicio;

public class Rectangle extends GeometricShapes {

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "\n\theight: " + getHeight() +
                "\n\twidth: " + getWidth() +
                "\n}";
    }
}
