package Module5.MinMax;

import java.util.Random;

public class MinMax {
    public static void main(String[] args) {


        int[] intArray = new int[10];
        Random rand  = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(50);
            System.out.print(intArray [i] + " ");
        }
        int max = intArray[0];
        int min = intArray[0];
        for (int i = 0; i<intArray.length; i++)
        {
            if (max < intArray[i])
                max = intArray[i];
            else {
                if (min > intArray[i])
                    min = intArray[i];
            }
            }
        System.out.println("Maximum = " + max);


        System.out.println("Minuimum = " + min);
        }





}