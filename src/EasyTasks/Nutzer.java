package EasyTasks;

public class Nutzer implements AbstrakteStrategie {
private final AbstrakteStrategie strategie;


    public Nutzer(AbstrakteStrategie strategie) {
        this.strategie = strategie;

    }

    @Override
    public void operation() {
        strategie.operation();
    }
}
