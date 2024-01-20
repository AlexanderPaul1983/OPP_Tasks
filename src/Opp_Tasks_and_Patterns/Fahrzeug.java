package Opp_Tasks_and_Patterns;

public class Fahrzeug {
    int motorVolumen;
    String farbe;
    int whealsAnzahl;
    int key;
    private String marke;
    private String modell;
    private int kilometerstand;

    public void fahre(int gefahreneKilometern) {
        kilometerstand += gefahreneKilometern;
    }
    public void setFarbe (String farbe){
        this.farbe = farbe;
    }
    public void motorStarten ( int fahrzeugKey){
        if (fahrzeugKey == key) {
            System.out.println("Das Fahrzeug wurde gestartet");
        } else {
            System.out.println("falscher Schlüssel");
        }

    }

    public Fahrzeug(int motorVolumen, String farbe, int whealsAnzahl, int key, String marke, String modell, int kilometerstand) {
        this.motorVolumen = motorVolumen;
        this.farbe = farbe;
        this.whealsAnzahl = whealsAnzahl;
        this.key = key;
        this.marke = marke;
        this.modell = modell;
        this.kilometerstand = kilometerstand;
    }

    public void zeigeInfos() {
        System.out.println("Hersteller: " + marke + "\n" + "Autotyp ist " + modell + " mit einem Kilometerstand von " +
                kilometerstand + "km." + " Farbe ist " + farbe + ".");

    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
