package EasyTasks;

public class Singleton {
    public  String name;
    private static Singleton king;

    private Singleton(){};

    public static Singleton getInstance(){
        if(king == null){
            king = new Singleton();

        }
        return king;
    }
    public void setName(String koenig){
        name = koenig;
    }
    public void Befehl1(){
        System.out.println(name + " Ich befehle");
    }
    public void Befehl2(){
        System.out.println( name + "Ich befehle nicht");
    }
}
