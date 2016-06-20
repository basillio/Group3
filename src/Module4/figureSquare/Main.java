package Module4.figureSquare;

public class Main {
    public static void main (String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        circle.setRadius(-5);


        triangle.setA(-3);
        triangle.setB(3);
        triangle.setC(-3);


        rectangle.setA(-3.45);
        rectangle.setB(0.22);

        System.out.println("Circle Square = " + circle.getSquare());
        System.out.println("Triangle" + triangle.getSquare());
        System.out.println("Rectangle" + rectangle.getSquare());
    }
}
