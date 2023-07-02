import EasyTasks.*;

public class Main {
    public static void main(String[] args) {

        Singleton Ludwig = Singleton.getInstance();
        Ludwig.setName("Ludwig");
        Ludwig.Befehl1();
        Singleton Heinrich = Singleton.getInstance();
        Heinrich.setName("Heinrich");
        Heinrich.Befehl1();
        Ludwig.Befehl1();




    }


}

