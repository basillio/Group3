package Module4.figureSquare;
import java.lang.Math;

public class Triangle extends Figure {
    private double a = 3;
    private double b = 4;
    private double c = 5;


    public double getSquare(){
       double p = (a+b+c)/2;
       double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }


}
