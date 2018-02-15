package test;
/**
 * Created by hamzaarab on 2/15/2018.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Launcher {

    public static void main(String[] args) {
        String[] contextPaths = new String[]{"app.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}

