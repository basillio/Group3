package Module4.figureSquare;

public class Rectangle extends Figure {
    private double a = 12.3;
    private double b = 22.9;

    @Override
    public double getSquare(){
        double square = a*b;
        return square; //возвращаем площадь
    }
}