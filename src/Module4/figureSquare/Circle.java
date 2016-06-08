package Module4.figureSquare;
import java.lang.Math;

public class Circle extends Figure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
     @Override
    public double getSquare(){
       return Math.PI*radius*radius;


    }


}
