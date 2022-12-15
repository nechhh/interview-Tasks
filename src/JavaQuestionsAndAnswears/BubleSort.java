package JavaQuestionsAndAnswears;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {


        int[] arr = {6, 4, 5, 10, 545, 64, 7, 66, 35, 456, 7, 567, 3, 1, 2};


        System.out.println((Arrays.toString(arr)));
        int size = arr.length;


        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j

                        + 1]) {
                    int tmp = arr[j];


                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;


                }

            }


        }
        System.out.println((Arrays.toString(arr)));


    }


}
