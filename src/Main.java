import Wiederholung.PDFreportGenerator;
import Wiederholung.ReportService;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

    Random random = new Random();
    int randomNumber = random.nextInt(6);
    int randWithoutZero = randomNumber + 1;

        System.out.println(randWithoutZero);



    }


}

