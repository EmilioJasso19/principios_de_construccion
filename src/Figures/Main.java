package Figures;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle( 4, 3);
        System.out.println("The area of the rectangle with a width of: " + rectangle1.getWidth() +
                " and a height of: " + rectangle1.getHeight() + "\n" +
                "is: " + rectangle1.getArea() +
                ", and its perimeter: " + rectangle1.getPerimeter());

        rectangle1.resize(3);
        try {
            Thread.sleep(1000);
            System.out.println("Resizing");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The new area of the rectangle is: " + rectangle1.getArea());
        System.out.println("And its new perimeter is: " + rectangle1.getPerimeter());

        Triangle triangle1 = new Triangle( 4, 3);
        System.out.println("The area of the triangle with a width of: " + triangle1.getWidth() +
                " and a height of: " + triangle1.getHeight() + "\n" +
                "is: " + triangle1.getArea() +
                ", and its perimeter: " + triangle1.getPerimeter());
    }
}
