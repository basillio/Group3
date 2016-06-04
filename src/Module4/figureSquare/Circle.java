package Module4.figureSquare;


class Circle extends Figure {
    double radius;

   private double square = Math.PI * radius * radius;

    public double getCircleSquare(double radius){
        double square = Math.PI * radius * radius;
        return square; //возвращаем площадь
    }

}
