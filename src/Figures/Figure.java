package Figures;

public abstract class Figure {

    private int numberOfSides;

    public Figure(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    abstract double getArea();
    abstract double getPerimeter();
}
