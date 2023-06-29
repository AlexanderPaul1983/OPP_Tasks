package EasyTasks;

public class Nutzer implements AbstrakteStrategie {
public AbstrakteStrategie strategie;

public void operation(){
    strategie.operation();
};
}
