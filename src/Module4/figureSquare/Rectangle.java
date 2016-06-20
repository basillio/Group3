package Module4.figureSquare;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public void setA(double a) {
        this.a = a;
        try {
            if (a < 0)
                throw new NegativeLengthException(a);
        } catch (NegativeLengthException e) {
            System.out.println("[Error]: Side of rectangle '" + e.getLength() + "' should be non-negative!");
        }
    }

    public void setB(double b) {
        this.b = b;
        try {
            if (b < 0)
                throw new NegativeLengthException(b);
        } catch (NegativeLengthException e) {
            System.out.println("[Error]: Side of rectangle '" + e.getLength() + "' should be non-negative!");
        }
    }

    @Override
    public double getSquare() {
        double s = 0;
        if (a > 0 && b > 0)
            s = a * b;
        else {
            try {
                throw new SquareException();
            } catch (SquareException e) {
                System.out.println("[Error]:Square could not be count! One of parametrs is negative");
            }

        }
        return s;
    }
}
