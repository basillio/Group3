package Module4.figureSquare;

public class Rectangle extends Figure {
    private double a = 12.3;
    private double b = 22.9;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getSquare(){
        double square = a*b;
        return square; //возвращаем площадь
    }
}