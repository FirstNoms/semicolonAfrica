package Estore;

public class User {
    private  int age;
    private String email;
    private String name;
    private String password;
    private String phoneNumber;
    private Address homeAddress;

    public User() {

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return homeAddress;
    }

    public void setAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }



    public User(int age, String email, String name, String password, String phoneNumber, Address homeAddress) {
        this.age = age;
        this.email = email;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
    }


}
