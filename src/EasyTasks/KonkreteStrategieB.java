package EasyTasks;

public class KonkreteStrategieB implements AbstrakteStrategie{

    public KonkreteStrategieB() {

    }
    @Override
    public void operation() {
        System.out.println("Ich bin Strategie B");
    }
}
