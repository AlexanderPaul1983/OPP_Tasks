package SortAlgorithmen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // [2,3,6,4,8,13]
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(13);

        BubbleSort bubble = new BubbleSort();
        System.out.println(bubble.sort(arrayList));
    }
}
