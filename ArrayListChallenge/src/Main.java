import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("1111 222 3333");

    public static void main(String[] args){
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: 6 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact phone number:");
        String phoneNum = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phoneNum);
        mobilePhone.addContact(newContact);
    }

    private static void updateContact(){
        System.out.println("Enter the contact name to be updated:");
        String oldName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldName);
        if(oldContact == null){
            System.out.println("Old Contact not found.");
            return;
        }
        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number:");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newPhone);
        if(mobilePhone.updateContact(oldContact,newContact)){
            System.out.println("Successfully updated.");
        } else{
            System.out.println("Error updating, duplicated contact");
        }
    }

    private static void removeContact(){
        System.out.println("Enter the contact name to be deleted: ");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if(contact == null) {
            System.out.println("contact not found.");
            return;
        }
        mobilePhone.deleteContact(contact);
    }

    private static void queryContact(){
        System.out.println("enter contact name: ");
        String name = scanner.nextLine();
        Contact existedContact = mobilePhone.queryContact(name);
        if(existedContact == null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Contact name: " + existedContact.getName() + " Phone number: " + existedContact.getPhoneNum());
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
