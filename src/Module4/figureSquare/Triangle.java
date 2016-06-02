package Module4.figureSquare;
import java.lang.Math;

public class Triangle extends Figure {


    public double tirangle(double a, double b, double c){
       double p = (a+b+c)/2;
       double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }


}
