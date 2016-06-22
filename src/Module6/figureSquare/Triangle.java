package Module6.figureSquare;
import java.lang.Math;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public void setA(double a) {

        this.a = a;
        try {
            if (a<0)
                throw new NegativeLengthException(a);
        } catch (NegativeLengthException e) {
            System.out.println("[Error]: Side of triangle '" + e.getLength() + "' should be non-negative!");
        }
    }
    public void setB(double b) {
        this.b = b;
        try {
            if (b<0)
                throw new NegativeLengthException(b);
        } catch (NegativeLengthException e) {
            System.out.println("[Error]: Side of triangle '" + e.getLength() + "' should be non-negative!");
        }
    }

    public void setC(double c) {
        this.c = c;
        try {
            if (c<0)
                throw new NegativeLengthException(c);
        } catch (NegativeLengthException e) {
            System.out.println("[Error]: Side of triangle '" + e.getLength() + "' should be non-negative!");
        }
    }





    public double getSquare()  {
        double s = 0;
        if (a>0 && b>0 && c>0) {
            double p = (a + b + c) / 2;
            s =Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
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
