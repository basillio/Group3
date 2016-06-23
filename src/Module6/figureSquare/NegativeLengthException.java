package Module6.figureSquare;


public class NegativeLengthException extends Exception {
    private double length;

    public NegativeLengthException(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}
