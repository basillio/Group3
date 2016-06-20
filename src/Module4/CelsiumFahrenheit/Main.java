package Module4.CelsiumFahrenheit;

/**
 * Created by vberezovskii on 20.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        FahrengheitCounter fc = new FahrengheitCounter();
        CelciumCounter cc = new CelciumCounter();

        fc.setTempCelcium(0);
        System.out.println("Fahrengheit temperature is = " + fc.getDegree());
        cc.setTempFahrengheit(0);
        System.out.println("Celcium temperature is = " + cc.getDegree());
    }
}