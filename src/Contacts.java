import java.util.ArrayList;

public class Contacts {
    private String name;
    private String phoneNumber;
    private ArrayList<Messages> message;

    public Contacts(String name, String phoneNumber, ArrayList<Messages> message) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public void getDetails () {
        System.out.println("Name: " + this.name +
                "\nPhone Number: " + this.phoneNumber +
                "\n********************");
    }

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Messages> getMessage() {
        return message;
    }

    public void setMessage(ArrayList<Messages> message) {
        this.message = message;
    }
}
