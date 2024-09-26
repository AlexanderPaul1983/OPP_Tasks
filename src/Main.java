import Wiederholung.PDFreportGenerator;
import Wiederholung.ReportService;

public class Main {
    public static void main(String[] args) {


        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        int ergebnis = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                ergebnis += matrix[i][j];

            }

        }
        System.out.println(ergebnis);

    }


}

