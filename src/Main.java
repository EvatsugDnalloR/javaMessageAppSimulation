import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Messager");

        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("AUG");
        contacts.add("GUS");
        contacts.add("EFE");
        contacts.add("LI");
        contacts.add("AYM");

        for (int i = 0; i<999999999; i++) {
            Scanner universalScanner = new Scanner(System.in);

            System.out.println("CHOOSE WHAT YOU'D LIKE TO DO");
            System.out.println("1. All Contacts");
            System.out.println("2. All Messages");
            System.out.println("3. quit the APP");

            int input1 = universalScanner.nextInt();
            if (input1==1) {
                for (int w = 0; w<999999999; w++) {
                    System.out.println("Names: ");
                    for (int p=0; p<contacts.size(); p++) {
                        System.out.println(contacts.get(p));
                    }
                    System.out.println("CHOOSE YOUR ACTION");
                    System.out.println("1. Add New Contacts");
                    System.out.println("2. Delete Contacts");
                    System.out.println("3. Modify Contacts");
                    System.out.println("4. Go Back To Last Page");

                    int input11 = universalScanner.nextInt();
                    if (input11==1) {
                        System.out.println("Please enter the Name...");
                        String newName = universalScanner.next();

                        contacts.add(newName);
                        System.out.println("New Contact added");
                    } else if (input11==2) {
                        System.out.println("Please select which Contacts you want to delete...");
                        for (int p=0; p<contacts.size(); p++) {
                            System.out.println(contacts.get(p));
                        }
                        System.out.println("Enter your choice...");
                        String deleteName = universalScanner.next();
                        if (contacts.contains(deleteName)) {
                            System.out.println(deleteName + " has been deleted...");
                            contacts.remove(deleteName);
                        } else if (!contacts.contains(deleteName)) {
                            System.out.println(deleteName + " doesn't exist...");
                        }
                    } else if (input11==3) {
                        for (int p=0; p<contacts.size(); p++) {
                            System.out.println(contacts.get(p));
                        }
                        System.out.println("Enter your choice...");
                        String originalName = universalScanner.next();
                        if (contacts.contains(originalName)) {
                            System.out.println("Enter your new name...");
                            String modifiedName = universalScanner.next();
                            contacts.set(contacts.indexOf(originalName), modifiedName);
                        } else if (!contacts.contains(originalName)) {
                            System.out.println(originalName + " doesn't exist...");
                        }
                    } else {
                        break;
                    }
                }


            }
    }
}
}