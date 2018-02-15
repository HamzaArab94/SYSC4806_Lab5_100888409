package test;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by hamzaarab on 2/15/2018.
 */
public class MyJButton extends JButton {

    private ActionListener listener;

    public MyJButton() {
        super("AddressBook");
    }

    public void setActionListener(ActionListener listener) {
        this.listener = listener;
    }

    public void init() {
        this.addActionListener(listener);
    }

}
