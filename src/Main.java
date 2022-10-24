import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Messager");

        ArrayList<Contacts> contacts = new ArrayList<>();
        contacts.add(new Contacts("AUG", "114514"));
        contacts.add(new Contacts("GUS", "1919819"));
        contacts.add(new Contacts("EFE", "10101010"));
        contacts.add(new Contacts("LI", "29292929"));
        contacts.add(new Contacts("AYM", "38383838"));

        for (int i = 0; i<999999999; i++) {
            Scanner universalScanner = new Scanner(System.in);

            System.out.println("CHOOSE WHAT YOU'D LIKE TO DO");
            System.out.println("1. All Contacts");
            System.out.println("2. All Messages");
            System.out.println("3. quit the APP");

            int input1 = universalScanner.nextInt();
            if (input1==1) {
                for (Contacts c: contacts) {
                    System.out.println("Names + Phone Numbers");
                    System.out.println(c.getName() + c.getPhoneNumber());
                }
                System.out.println("CHOOSE YOUR ACTION");
                System.out.println("1. Add New Contacts");
                System.out.println("2. Delete Contacts");
                System.out.println("3. Modify Contacts");
                System.out.println("4. Go Back To Last Page");

                int input11 = universalScanner.nextInt();
                switch (input11) {
                    case 1:
                        System.out.println("Please enter the Name...");
                        String newName = universalScanner.next();

                        System.out.println("Please enter the Phone Number...");
                        String newNumber = universalScanner.next();

                        contacts.add(new Contacts(newName, newNumber));
                        break;

                    case 2:
                        System.out.println("Please select which Contacts you want to delete...");
                        for (Contacts c: contacts) {
                            System.out.println(c.getName());
                        }
                        System.out.println("Enter your choice...");
                        String deleteName = universalScanner.next();
                        if (contacts.contains(deleteName)) {
                            contacts.remove(deleteName);
                        }else if (!contacts.contains(deleteName)){
                            System.out.println("Doesn't exist this Contact");
                        }
                        break;

                    default:
                        return;


                }
            }
        }
    }
}