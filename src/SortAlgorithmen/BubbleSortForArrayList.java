package SortAlgorithmen;

import java.util.ArrayList;

public class BubbleSortForArrayList {


    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {


        // [2,3,7,0,49,6]
        int flag = arrayList.size();
        while (flag != 0) {
            flag = 0;
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if (arrayList.get(i) > arrayList.get(i + 1)) {
                    int temp = arrayList.get(i);
                    // zahlen werden vertauscht
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                    flag++;
                }
            }
        }
        return arrayList;
    }




}
