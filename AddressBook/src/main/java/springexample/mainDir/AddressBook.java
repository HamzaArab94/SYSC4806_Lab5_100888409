package springexample.mainDir;


import java.util.ArrayList;

/**
 * Created by hamzaarab on 2/8/2018.
 */

public class AddressBook {


    private ArrayList<BuddyInfo> contacts;

    public AddressBook() { contacts = new ArrayList<BuddyInfo>(); }

    public ArrayList<BuddyInfo> getContacts() { return contacts; }

    public void addNewContact(BuddyInfo buddy) { contacts.add(buddy); }

    public String getBuddies(){
        String buddies = "";
        for(int i=0; i<contacts.size(); i++){
            buddies += ("printBuddies: "+contacts.get(i).getName() +"/n");
        }
        return buddies;

    }

    public static void main(String [ ] args)
    {
        AddressBook contacts = new AddressBook();

        BuddyInfo buddy1 = new BuddyInfo("Guled Arab", "6132495860");
        BuddyInfo buddy2 = new BuddyInfo("Ahmed Arab", "6134109394");
        BuddyInfo buddy3 = new BuddyInfo("Mustafa Arab", "6131284984");

        contacts.addNewContact(buddy1);
        contacts.addNewContact(buddy2);
        contacts.addNewContact(buddy3);
    }

}

