package SortAlgorithmen;

import java.util.ArrayList;

public class BubbleSort {

    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        // [2,3,7,0,49,6]
        int flag = arrayList.size();
        while (flag != 0) {

            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) <= arrayList.get(i + 1)) {
                    flag--;
                    continue;
                } else {
                    arrayList.add(i, arrayList.get(i + 1));
                    flag--;
                }
            }
        }
        return arrayList;
    }
}
