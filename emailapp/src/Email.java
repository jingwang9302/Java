import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String alternateEmail;
    private int mailboxCapacity;
    private String email;
    private int defaultPasswordLength = 8;
    private String companySuffix = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + firstName + " " + lastName);
        this.department = setDepartment();
        this.password = setPassword(defaultPasswordLength);
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+ companySuffix;
        System.out.println(email);
        System.out.println(password);
    }


    private String setDepartment() {
        System.out.println("Enter the department \n1 for Sales\n2 for Development\n3 for Accounting\n4 for none");
        Scanner scanner =  new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if (depChoice == 1){return "sales";}
        else if (depChoice == 2){return "dev";}
        else if (depChoice == 3){return "acc";}
        else {return "";}
    }

    private String setPassword(int length) {

        String passwordChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#!%*";
        char[] password = new char[length];
        for (int i = 0; i<length; i++){
            int rand = (int)(Math.random() * passwordChar.length());
            password[i] = passwordChar.charAt(rand);
        }
        return new String(password);
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getPassword() {
        return password;
    }


}
