package Module4.figureSquare;

public class Main {
    public static void main (String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();


        System.out.println("Triangle" + triangle.getSquare());
        System.out.println("Circle Square = " + circle.getSquare());
        System.out.println("Rectangle" + rectangle.getSquare());
    }
}
