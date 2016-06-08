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
        return a*b;

    }
}