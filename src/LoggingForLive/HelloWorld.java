package LoggingForLive;
import  java.util.logging.Logger;
import java.util.logging.Level;

public class HelloWorld {
    private static final Logger logger = Logger.getLogger(HelloWorld.class.getName());
    public static void helloWorld(){
        logger.log(Level.INFO, "Hello World wurde geschrieben");
        System.out.println("Hello Welt");

    }

    public static void main(String[] args) {
        logger.setLevel(Level.ALL);
        helloWorld();
        int Hello = 6;
        if(Hello <= 4){
            System.out.println("Hello");
        } else if (Hello > 4) {
            System.out.println("greater");

        }

    }

    }

