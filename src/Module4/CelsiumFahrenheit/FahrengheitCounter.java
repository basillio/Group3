package Module4.CelsiumFahrenheit;

/**
 * Created by vberezovskii on 20.06.2016.
 */
public class FahrengheitCounter extends Degree{
    private double tempCelcium = 0;
    private double tempFahrengheit = 0;

    public void setTempCelcium (double tempCelcium) {
        this.tempCelcium = tempCelcium;
    }
    @Override
    public double getDegree() {
        return tempFahrengheit = 9 * tempCelcium / 5 +32;
    }
}
