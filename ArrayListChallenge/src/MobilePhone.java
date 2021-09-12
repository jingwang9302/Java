import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public void addContact(Contact newContact){

        if(findContact(newContact)>0){
            System.out.println("Contact has already exist.");
        }else{
            this.myContacts.add(newContact);
        }
    }

    private int findContact(Contact contact){
        System.out.println(this.myContacts.indexOf(contact));
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0; i<this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                System.out.println("find -----------------  " + i);
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(findContact(oldContact)<0){
            System.out.println("Contact not exist, cannot be modify");
            return false;
        } else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() + " already exist.");
            return false;
        }
        int position = findContact(oldContact);
        this.myContacts.set(position, newContact);
        System.out.println("replace completed");
        return true;
    }

    public void deleteContact(Contact contact){
        if (findContact(contact)<0){
            System.out.println("Contact not exist, cannot delete.");
        }
        int position = findContact(contact);
        this.myContacts.remove(position);
        System.out.println("delete completed");
    }

    public void printContacts(){
        System.out.println("Contact list:");
        for(int i=0;i<this.myContacts.size();i++){
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName()+ " -> " +
                    this.myContacts.get(i).getPhoneNum());
        }
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }


}
