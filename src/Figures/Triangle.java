package Figures;

public class Triangle extends Figure {

    private double width;
    private double height;

    public Triangle(double width, double height) {
        super(3); // Default sides of a Triangle
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double getArea() {
        return (width * height) / 2;
    }

    @Override
    double getPerimeter() {
        return width * getNumberOfSides();
    }
}
