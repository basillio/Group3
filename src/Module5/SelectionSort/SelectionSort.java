package Module5.SelectionSort;

import java.util.Random;

/**
 * Created by vberezovskii on 20.06.2016.
 */
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = new int[10];
        Random rand = new Random();
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50);

            System.out.print(arr [i] + " ");

        }
        System.out.println(" ");
        System.out.println("Sorted array: ");
            for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;

            for (int j = i+1; j < arr.length; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }

                System.out.print(arr [i] + " ");

        }

    }
}
