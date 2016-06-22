package Module6.DistanceCounter;

import java.util.Scanner;

/**
 * Created by vberezovskii on 20.06.2016.
 */
public class InputScanner {
    public InputScanner(){
        System.out.println("Please enter X1");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        try {
            double coordinate = Double.parseDouble(userInput
            if(coordinate !='' )


            {
                System.out.println("Coordinate number '" + coordinate + "' in not correct!");
            }
        }
        catch (NotNumberException e){
        System.out.println("Input correct number!");

    }

}
