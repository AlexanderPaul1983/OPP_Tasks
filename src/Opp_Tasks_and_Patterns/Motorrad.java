package Opp_Tasks_and_Patterns;

public class Motorrad extends Fahrzeug{
    boolean katolizator;

    public Motorrad(int motorVolumen, String farbe, int whealsAnzahl, int key, String marke, String modell, int kilometerstand, boolean katolizator) {
        super(motorVolumen, farbe, whealsAnzahl, key, marke, modell, kilometerstand);
        this.katolizator = katolizator;
    }

    public void neigen(){
        System.out.println("ich fahre geneigt");
    }
}
