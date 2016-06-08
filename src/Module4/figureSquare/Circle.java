package Module4.figureSquare;

public class Circle extends Figure {
    private double radius;


    //public void Circle(){

// }
    @Override
    public double getSquare(){
       double square = Math.PI*radius*radius; //вычисляем площадь
        return square; //возвращаем площадь
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
