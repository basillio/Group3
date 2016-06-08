package Module4.figureSquare;
import java.lang.Math;

public class Triangle extends Figure {
    private double a = 3;
    private double b = 4;
    private double c = 5;

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setA(double a) {

        this.a = a;
    }

    public double getSquare(){
       double p = (a+b+c)/2;
       double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }


}
