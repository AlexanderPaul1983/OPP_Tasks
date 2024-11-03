package SortAlgorithmen;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BubbleSortForArray {
    public int[] sort(int[] array) {


        // [2,3,7,0,49,6]
        int flag = array.length;

        while (flag != 0){
            flag = 0;
            for (int i = 0; i < array.length - 1 ; i++) {
                if (array[i] > array[i + 1]){
                    int firstnumber = array[i];
                    int secondNumber = array[i + 1];
                    array[i] = secondNumber;
                    array[i + 1] = firstnumber;
                    flag++;
                }

            }

        }


        return array;
    }
}
