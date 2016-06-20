package Module4.figureSquare;
import java.lang.Math;

public class Circle extends Figure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;

    }

    @Override
    public double getSquare() {
        double r =0;
        try {
            if (radius < 0)
                throw new NegativeLengthException(radius);
            else
                 r = Math.PI * radius * radius; }
        catch (NegativeLengthException e) {
            System.out.println("[Error]: Radius '" + e.getLength() + "' should be positive!");
        }
        return r;
    }
}
