package BankPHP;

import java.util.ArrayList;

public class User {
    private  String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private final ArrayList<Account> accounts = new ArrayList<>();


    public User(String firstName, String lastName, String emailAddress, String phoneNumber) {
        this.firstName = firstName;
        this. lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        createAccount(firstName);
    }

    public void createAccount(String accountName){
        Account account = new Account(accountName);
        accounts.add(account);
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }

}
