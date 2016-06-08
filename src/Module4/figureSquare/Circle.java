package Module4.figureSquare;

public class Circle extends Figure {
    private double radius = 5;
    private double Square;

    //public void Circle(){

// }
    @Override
    public double getSquare(){
        Square = Math.PI*radius*radius; //вычисляем площадь
        return Square; //возвращаем площадь
    }

}
