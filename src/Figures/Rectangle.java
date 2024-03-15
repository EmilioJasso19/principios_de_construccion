package Figures;

public class Rectangle extends Figure implements Resize {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(4); // Default sides of a rectangle
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
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public void resize(double factorX) {
        width *= factorX;
        height *= factorX;
    }
}
