package Module4.DistanceCounter;

/**
 * Created by vberezovskii on 20.06.2016.
 */
public class Main {
    public static void main (String [] args){
        Distance d = new Distance();
        d.setX1(2);
        d.setX2(3);
        d.setY1(3);
        d.setY2(3);

        System.out.println("Distance between points is: " + d.getDistance());
    }
}
