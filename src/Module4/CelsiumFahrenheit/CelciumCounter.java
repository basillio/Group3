package Module4.CelsiumFahrenheit;

/**
 * Created by vberezovskii on 20.06.2016.
 */
public class CelciumCounter extends Degree{
    double tempCelcium = 0;
    double tempFahrengheit = 0;



        public void setTempFahrengheit (double tempFahrengheit) {
            this.tempFahrengheit = tempFahrengheit;
        }
        @Override
        public double getDegree() {
            return tempCelcium =  (tempFahrengheit-32)*5/9;
        }
    }


