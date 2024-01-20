package LoggingForLive;

import java.util.ArrayList;

public class Labdas {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(8);
        arraylist.add(20);
        arraylist.add(13);

        arraylist.forEach(System.out::println);
    }

}
