import EasyTasks.*;
import Opp_Tasks_and_Patterns.Auto;
import Opp_Tasks_and_Patterns.Fahrzeug;
import Opp_Tasks_and_Patterns.Motorrad;

public class Main {
    public static void main(String[] args) {
        Auto myAuto = new Auto(4800, "schwarz", 4, 12, "BMW","330",160, true);
        Motorrad myMotorrad = new Motorrad(550, "weiß",2, 10, "Honda", "GT",250, false);
        myAuto.zeigeInfos();
        myAuto.scheibenWischen();
        myAuto.motorStarten(12);
        myMotorrad.zeigeInfos();
        myMotorrad.neigen();
        myMotorrad.motorStarten(9);


    }


}

