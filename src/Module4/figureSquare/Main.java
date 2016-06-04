package Module4.figureSquare;

public class Main {
    public static void main (String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();


        System.out.println("Triangle" + triangle.getTirangleSquare(3,4,5));
        System.out.println("Circle Square = " + circle.getCircleSquare(5));
        System.out.println("Rectangle" + rectangle.getRectangleSquare(4,5));
    }
}
