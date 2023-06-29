import EasyTasks.AbstrakteStrategie;
import EasyTasks.KonkreteStrategieA;
import EasyTasks.KonkreteStrategieB;
import EasyTasks.Nutzer;

public class Main {
    public static void main(String[] args) {
        // Hier werden die Objekte Strategie A und B erstellt

        AbstrakteStrategie Strategy_A = new KonkreteStrategieA();
        AbstrakteStrategie Strategy_B = new KonkreteStrategieB();

// und hier werden diese Objekte an Nutzer übergeben, man könnte Nutzer vielleicht als Play nennen, aber ist Geschmack Sache
        Nutzer player1 = new Nutzer(Strategy_A);
        player1.operation();
        Nutzer player2 = new Nutzer(Strategy_B);
        player2.operation();




    }


}

