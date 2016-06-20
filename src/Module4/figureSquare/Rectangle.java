package Module4.figureSquare;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public void setA(double a) {
        this.a = a;

    }


    public void setB(double b) {
        this.b = b;

    }

    @Override
    public double getSquare(){
        try {
            if (b<0)
                throw new NegativeLengthException(b);
        } catch (NegativeLengthException e) {
            System.out.println("[Error]: Side of rectangle '" + e.getLength() + "' should be non-negative!");
        }
        return a*b;

    }
}