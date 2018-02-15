package test;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by hamzaarab on 2/15/2018.
 */
@Entity
public class AddressBook extends Observable {

    private List<BuddyInfo> contacts;

    private Integer id;

    public AddressBook() {
        contacts = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        contacts.add(buddy);
        this.setChanged();
        this.notifyObservers(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        contacts.remove(buddy);
    }

    @OneToMany(cascade = CascadeType.ALL)
    public List<BuddyInfo> getContacts() {
        return contacts;
    }

    public void setContacts(List<BuddyInfo> contacts) {
        this.contacts = contacts;
    }

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Guled", "3029");
        BuddyInfo buddy1 = new BuddyInfo("Ahmed", "4832");
        BuddyInfo buddy2 = new BuddyInfo("Mustafa", "1290");
        BuddyInfo buddy3 = new BuddyInfo("Shaq", "5638");
        book.addBuddy(buddy);
        book.addBuddy(buddy1);
        book.addBuddy(buddy2);
        book.addBuddy(buddy3);

        for (BuddyInfo b : book.getContacts()) { System.out.println(b); }
    }
}
