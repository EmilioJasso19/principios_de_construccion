package ejercicio;

public class Main {

    public static void main(String[] args) {

        System.out.println("========================================== RECTANGLE ==========================================");
        Rectangle rectangle = new Rectangle(21, 37);
        showShape(rectangle);

        System.out.println("========================================== TRIANGLE ==========================================");
        EquilateralTriangle triangle = new EquilateralTriangle();
        showShape(triangle);
    }

    static void showShape(Rectangle rectangle) {
        System.out.println("The measures of the rectangle are: \n"
                + "height: " + rectangle.getHeight()
                + "\nwidth: " + rectangle.getWidth());

        rectangle.setHeight(Math.random() * 100);
        System.out.println("New height: " + rectangle.getHeight());

        rectangle.setWidth(Math.random() * 100);
        System.out.println("New width: " + rectangle.getWidth());

        System.out.println(rectangle.toString());
        System.out.println("The area of the rectangle is: " + rectangle.calculateArea() +
                ", and its perimeter is: " + rectangle.calculatePerimeter());
    }

    static void showShape(EquilateralTriangle triangle) {
        System.out.println("The measures of the triangle are: \n"
                + "height:" + triangle.getHeight()
                + "\nwidth: " + triangle.getWidth());

        triangle.setHeight(Math.random() * 100);
        System.out.println("New height: " + triangle.getHeight());

        triangle.setWidth(Math.random() * 100);
        System.out.println("New width: " + triangle.getWidth());

        System.out.println(triangle.toString());
        System.out.println("The area of the rectangle is: " + triangle.calculateArea() +
                ", and its perimeter is: " + triangle.calculatePerimeter());
    }

}
