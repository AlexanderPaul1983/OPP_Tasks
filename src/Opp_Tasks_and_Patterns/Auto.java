package Opp_Tasks_and_Patterns;

public class Auto extends Fahrzeug {
    boolean sitzHeizung;

    public Auto(int motorVolumen, String farbe, int whealsAnzahl, int key, String marke, String modell, int kilometerstand, boolean sitzHeizung) {
        super(motorVolumen, farbe, whealsAnzahl, key, marke, modell, kilometerstand);
        this.sitzHeizung = sitzHeizung;
    }

    public void scheibenWischen(){
        System.out.println("wischi-wasche");
    }

    public boolean isSitzHeizung() {
        return sitzHeizung;
    }

    public void setSitzHeizung(boolean sitzHeizung) {
        this.sitzHeizung = sitzHeizung;
    }
}









