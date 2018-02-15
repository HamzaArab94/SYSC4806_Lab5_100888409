package test;

import javax.swing.*;

/**
 * Created by hamzaarab on 2/15/2018.
 */
public class MyJPanel extends JPanel {

    private MyJTextArea area;
    private MyJButton button;
    private AddressBook addressBook;

    public MyJPanel() {

    }

    public void setArea(MyJTextArea area) {
        this.area = area;
    }

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public void setButton(MyJButton button) {
        this.button = button;
    }

    public void init() {
        add(area);
        add(button);
        addressBook.addObserver(area);
    }
}
