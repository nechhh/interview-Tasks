package JavaQuestionsAndAnswears;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LargestNumMinAndMaxNum {
    public static void main(String[] args) {
        int [] arr={34,53,32,22,12,55,665,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Largest num = "+arr[arr.length-1]);
        System.out.println("Min num ="+arr[0]);
        System.out.println("Second Largest Num ="+arr[arr.length-2]);
        System.out.println();

         }


}
