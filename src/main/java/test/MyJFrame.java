package test;

import javax.swing.*;

/**
 * Created by hamzaarab on 2/15/2018.
 */
public class MyJFrame extends JFrame{

    private MyJPanel panel;
    private String name;

    public MyJFrame() {
    }

    public void setPanel(MyJPanel panel) {
        this.panel = panel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        setContentPane(panel);
        setVisible(true);
        setSize(500,500);
    }
}
