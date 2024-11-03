package SortAlgorithmen;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayList = {2, 0};

        System.out.println(Arrays.toString(arrayList));

        BubbleSortForArray bubble = new BubbleSortForArray();
        System.out.println(Arrays.toString(bubble.sort(arrayList)));
    }


}
