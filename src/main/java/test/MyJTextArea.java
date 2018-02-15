package test;

import javax.swing.*;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by hamzaarab on 2/15/2018.
 */
public class MyJTextArea extends JTextArea implements Observer {

    public void update(Observable o, Object arg) {
        append(arg.toString() + "\n");
    }
}
