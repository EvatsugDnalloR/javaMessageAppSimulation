import java.util.ArrayList;
import java.util.Iterator;
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
                    if (contact.size()>0) {
                        System.out.println("You have " + contact.size() + " Contacts now");
                    }else {
                        System.out.println("You don't have any contact yet...");
                    }

                    System.out.println("CHOOSE YOUR ACTION");
                    System.out.println("1. Add New Contact");
                    System.out.println("2. Delete a Contact");
                    System.out.println("3. Modify a Contact");
                    System.out.println("4. Search a Contact");
                    System.out.println("5. Show all the Contacts");
                    System.out.println("6. Go Back To The Menu");

                    int input11 = universalScanner.nextInt();
                    if (input11==1) {
                        boolean sameName = false;
                        boolean sameNumber = false;
                        System.out.println("Please enter the Name...");
                        String newName = universalScanner.next();
                        for (Contacts t: contact) {
                            if (t.getName().equals(newName)) {
                                System.out.println("This name already exists...");
                                sameName = true;
                            }
                        }
                        if (sameName) {
                            break;
                        }
                        System.out.println("Please enter the Phone Number");
                        String newPhoneNumber = universalScanner.next();
                        for (Contacts t: contact) {
                            if (t.getPhoneNumber().equals(newPhoneNumber)) {
                                System.out.println("This phone number already exists...");
                                sameNumber = true;
                            }
                        }
                        if (sameNumber) {
                            break;
                        }
                        Contacts list = new Contacts(newName, newPhoneNumber);
                        contact.add(list);
                        System.out.println("New Contact added");
                    } else if (input11==2) {
                        if (contact.size()>0) {
                            System.out.println("Please select which Contacts you want to delete...");
                            for (Contacts c: contact) {
                                c.getDetails();
                            }
                            System.out.println("Enter your choice...");
                            String deleteName = universalScanner.next();
                            Contacts b = null;
                            for (Contacts p: contact) {
                                if (p.getName().equals(deleteName)) {
                                    b = p;
                                    System.out.println(deleteName + " has been deleted");
                                    break;
                                } else {
                                    System.out.println("This contact doesn't exist");
                                    break;
                                }
                            }
                            contact.remove(b);
                        }
                        } else if (input11==3) {
                        if (contact.size()>0) {
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
                                    } else {
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
                                    }else {
                                        System.out.println("This contact doesn't exist");
                                        break;
                                    }

                                }
                            }else {
                                System.out.println("Canceled");
                                break;
                            }
                        }

                    } else if (input11==4) {
                        if (contact.size()>0) {
                            System.out.println("Enter the name you want to search...");
                            String searchName = universalScanner.next();
                            for (Contacts u: contact) {
                                if (u.getName().equals(searchName)) {
                                    u.getDetails();
                                } else {
                                    System.out.println("This contact doesn't exist");
                                    break;
                                }
                            }
                        }

                    } else if (input11==5) {
                        if (contact.size()>0) {
                            for (Contacts c: contact) {
                                c.getDetails();
                            }
                    }
                    }else {
                        break;
                    }
                }
            } else if (input1==2) {
                if (contact.size()>0) {
                    for (int t = 0; t<999999999; t++) {
                        System.out.println("CHOOSE YOUR ACTION");
                        System.out.println("1. Send new Messages");
                        System.out.println("2. Show the Messages");
                        System.out.println("3. Go Back To The Menu");

                        int input12 = universalScanner.nextInt();
                        if (input12==1) {
                            for (Contacts c: contact) {
                                c.getDetails();
                            }
                            System.out.println("Which contact do you want to choose");
                            String chooseContact = universalScanner.next();
                            System.out.println("Send what you want...");
                            String mesage = universalScanner.next();
                            Messages list = new Messages(mesage);
                            for (Contacts c: contact) {
                                if (c.getName().equals(chooseContact)) {
                                    ArrayList<Messages> messageList = c.getMessage();
                                    messageList.add(list);
                                    c.setMessage(messageList);
                                    System.out.println("Message sent");
                                }else {
                                    System.out.println("This contact doesn't exist...");
                                }
                            }
                        } else if (input12==2) {
                            ArrayList<Messages> allMessgaes = new ArrayList<>();
                            for (Contacts c: contact) {
                                c.getDetails();
                            }
                            System.out.println("Which Contact do you want to choose?");
                            String contactMessage = universalScanner.next();
                            for (Contacts c: contact) {
                                if (c.getName().equals(contactMessage)) {
                                    allMessgaes.addAll(c.getMessage());
                                    if (allMessgaes.size()>0) {
                                        for (Messages m: allMessgaes) {
                                            m.getDetails();
                                        }
                                    } else {
                                        System.out.println("You haven't sent any message to him...");
                                    }


                                }else {
                                    System.out.println("This contact doesn't exist...");
                                }
                            }
                        }else {
                            break;
                        }
                }
                }else {
                    System.out.println("You don't have any contact yet...");
                }
            }else {
                return;
            }
        }
}
}