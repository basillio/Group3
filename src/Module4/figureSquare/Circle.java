package Module4.figureSquare;


class Circle extends Figure {

    public double getCircleSquare(double radius){
        double square = Math.PI * radius * radius;
        return square; //возвращаем площадь
    }

}
