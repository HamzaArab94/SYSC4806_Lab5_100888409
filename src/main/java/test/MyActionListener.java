package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hamzaarab on 2/15/2018.
 */
public class MyActionListener implements ActionListener {
    private AddressBook addressBook;

    public MyActionListener() {
        this.addressBook = new AddressBook();
    }

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public void actionPerformed(ActionEvent e) {
            String name = JOptionPane.showInputDialog("Enter name");
            String number = JOptionPane.showInputDialog("Enter number");
            if (name != null && number != null) {
                BuddyInfo buddy = new BuddyInfo(name, number);
                addressBook.addBuddy(buddy);
            }
    }
}
