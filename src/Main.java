import EasyTasks.AbstrakteStrategie;
import EasyTasks.KonkreteStrategieA;
import EasyTasks.KonkreteStrategieB;
import EasyTasks.Nutzer;

public class Main {
    public static void main(String[] args) {

        AbstrakteStrategie strategieA = new KonkreteStrategieA();
        strategieA.operation();
        AbstrakteStrategie  strategieB = new KonkreteStrategieB();
        strategieB.operation();



    }


}

