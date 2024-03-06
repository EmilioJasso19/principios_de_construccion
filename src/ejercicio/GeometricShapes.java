package ejercicio;

public class GeometricShapes {

    private double height;
    private double width;

    public GeometricShapes() {
    }

    public GeometricShapes(double height, double width ) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return getHeight() * 2 + getWidth() * 2;
    }

    public double calculateArea() {
        return getHeight() * getWidth();
    }

    @Override
    public String toString() {
        return "FigurasGeometricas{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

}
