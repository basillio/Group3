package Module4.figureSquare;
import java.lang.Math;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

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
       return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }


}
