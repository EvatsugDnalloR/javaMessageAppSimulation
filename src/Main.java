import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static ArrayList<Contacts> contact;
    private static Scanner universalScanner;

    public static void main(String[] args) {

        System.out.println("Welcome to Java Messager");

        contact = new ArrayList<>();

        universalScanner = new Scanner(System.in);

        for (int i = 0; i<999999999; i++) {

            System.out.println("CHOOSE WHAT YOU'D LIKE TO DO");
            System.out.println("1. All Contacts");
            System.out.println("2. All Messages");
            System.out.println("3. Quit the APP");

            int input1 = universalScanner.nextInt();
            if (input1==1) {
                for (int w = 0; w<999999999; w++) {
                    System.out.println("Names: ");
                    for (Contacts c: contact) {
                        c.getDetails();
                    }
                    System.out.println("CHOOSE YOUR ACTION");
                    System.out.println("1. Add New Contact");
                    System.out.println("2. Delete a Contact");
                    System.out.println("3. Modify a Contact");
                    System.out.println("4. Search a Contact");
                    System.out.println("5. Go Back To The Menu");

                    int input11 = universalScanner.nextInt();
                    if (input11==1) {
                        System.out.println("Please enter the Name...");
                        String newName = universalScanner.next();
                        if (newName.equals("")) {
                            System.out.println("Invalid name, please enter some shit");
                            break;
                        }
                        System.out.println("Please enter the Phone Number");
                        String newPhoneNumber = universalScanner.next();
                        if (newPhoneNumber.equals("")) {
                            System.out.println("Invalid number, please enter some shit");
                            break;
                        }
                        Contacts list = new Contacts(newName, newPhoneNumber);
                        contact.add(list);
                        System.out.println("New Contact added");
                    } else if (input11==2) {
                        System.out.println("Please select which Contacts you want to delete...");
                        for (Contacts c: contact) {
                            c.getDetails();
                        System.out.println("Enter your choice...");
                        String deleteName = universalScanner.next();
                        for (Contacts p: contact) {
                            if (p.getName().equals(deleteName)) {
                                contact.remove(p);
                                System.out.println(deleteName + " has been deleted");
                            } else if (!p.getName().equals(deleteName)) {
                                System.out.println("This contact doesn't exist");
                                break;
                            }
                        }
                        }
                    } else if (input11==3) {
                        for (Contacts c: contact) {
                            c.getDetails();
                        }
                        System.out.println("Which value do you want to modify?");
                        System.out.println("1. Name");
                        System.out.println("2. Phone Number");
                        System.out.println("3. Cancel");
                        int input113 = universalScanner.nextInt();
                        if (input113==1) {
                            System.out.println("Which contact do you want to modify?");
                            String modifiedName = universalScanner.next();
                            for (Contacts o: contact) {
                                if (o.getName().equals(modifiedName)) {
                                    System.out.println("Enter the new name...");
                                    String newName = universalScanner.next();
                                    o.setName(newName);
                                } else if (!o.getName().equals(modifiedName)) {
                                    System.out.println("This contact doesn't exist");
                                    break;
                                }
                            }
                        } else if (input113==2) {
                            System.out.println("Which contact do you want to modify?");
                            String modifiedName = universalScanner.next();
                            for (Contacts o: contact) {
                                if (o.getName().equals(modifiedName)) {
                                    System.out.println("Enter the new Number");
                                    String newNumber = universalScanner.next();
                                    o.setPhoneNumber(newNumber);
                                }else if (!o.getName().equals(modifiedName)) {
                                    System.out.println("This contact doesn't exist");
                                    break;
                                }

                            }
                        }else {
                            System.out.println("Canceled");
                            break;
                        }
                    } else if (input11==4) {
                        System.out.println("Enter the name you want to search...");
                        String searchName = universalScanner.next();
                        for (Contacts u: contact) {
                            if (u.getName().equals(searchName)) {
                                u.getDetails();
                            } else if (!u.getName().equals(searchName))  {
                                System.out.println("This contact doesn't exist");
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else if (input1==2) {
                for (int t = 0; t<999999999; t++) {
                    System.out.println("CHOOSE YOUR ACTION");
                    System.out.println("1. Show the Messages");
                    System.out.println("2. Send new Messages");
                    System.out.println("3. Go Back To The Menu");

                    int input12 = universalScanner.nextInt();
                    if (input12==1) {

                    }
                }
            }
        }
}
}