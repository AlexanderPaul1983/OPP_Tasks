package Opp_Tasks_and_Patterns;

public class Auto {

    // Attributen

    private  String marke;
    private String modell;
    private int kilometerstand;

    // Konstruktor

    public Auto(String marke, String modell){
        this.marke = marke;
        this.modell = modell;
        this.kilometerstand = 0;
    }

    // Methoden

    public void fahre (int gefahreneKilometern){
        kilometerstand += gefahreneKilometern;
    }
    public void zeigeInfos(){
        System.out.println("Hersteller: " + marke + "\n" + "Autotyp ist " + modell + " mit einem Kilometerstand von " +
                kilometerstand + "km");
    }
    // Getter und Setter

}

