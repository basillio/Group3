package Module4.figureSquare;
import java.lang.Math;

public class Circle extends Figure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
        try {
            if (radius < 0)
                throw new NegativeLengthException(radius);
        } catch (NegativeLengthException e) {
            System.out.println("[Error]: Radius of circle '" + e.getLength() + "' should be non-negative!");
        }

    }

    @Override
    public double getSquare() {
        double r =0;
        if (r>0)
            r = Math.PI * radius * radius;
        else try {
            throw new SquareException();
        } catch (SquareException e) {
            System.out.println("[Error]:Square could not be count! One of parametrs is negative");
        }
        return r;
    }
}
