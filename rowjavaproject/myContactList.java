
package rowjavaproject;

import java.util.ArrayList;
import java.util.Scanner;


public class myContactList {
    
    public static void main(String[] args) {
        
        ContactList contactList = new ContactList();
        
        Scanner scanner = new Scanner(System.in);
        
        int menuItem=0;
        
        
        do{
            menuView();
            menuItem = scanner.nextInt();
            
            switch(menuItem){
                case 1:
                    Contact contact = CreateNewContact(scanner);
                    contactList.createContact(contact);
                    System.out.println("Contact Create Successfully...");
                    System.out.println("");
                    break;
                case 2:
                    showAllContacts(contactList.getContacts());
                    break;
                case 3:
                    searchContact(contactList,scanner);
                    break;
                    
                case 4 :
                    deleteContact(contactList,scanner);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Select a number between 1 to 5 :");
                    break;
                    
            }
        
        }while(menuItem!=5);
        
        
        
        
    }
    
    //preview Menu
    
    private static void menuView() {
        System.out.println(String.format("%5s%3s%s", "1.", " ", "Create New Contact"));
        System.out.println(String.format("%5s%3s%s", "2.", " ", "View All Contact"));
        System.out.println(String.format("%5s%3s%s", "3.", " ", "Search Contact"));
        System.out.println(String.format("%5s%3s%s", "4.", " ", "Delete Contact"));
        System.out.println(String.format("%5s%3s%s", "5.", " ", "Exit"));
        System.out.println("---------------------------");
        System.out.print(" Enter Your Choice : ");
    }

    private static Contact CreateNewContact(Scanner scanner) {
        
        String name,email,phone;
        Contact contact;
        
        scanner.nextLine();
        
        System.out.println("Fill up the form ");
        System.out.print("Enter name * :");
        name=scanner.nextLine();
        
        System.out.print("Enter phone * :");
        phone=scanner.nextLine();
        
        System.out.print("Type N if not applicable (Enter email  ): ");
        email=scanner.nextLine();
        
        if(email.equalsIgnoreCase("n")){
            contact = new Contact(name, phone);
        }else{
            contact=new Contact(name, phone, email);
        }
        
        return contact;
        
    }

    private static void showAllContacts(ArrayList<Contact> contacts) {
      
        System.out.println("All contacts ");
        System.out.println("--------------------------");
        
        int i=0;
        
        for(Contact contact : contacts){
            
            String email = contact.getEmail();
            System.out.println(String.format("%-5d%-20s%-15s%-50s", i++, contact.getName(),contact.getPhoneNumber(),email==null? "N/A":email));
            
        }
        System.out.println("---------------------------");
    }

    private static void searchContact(ContactList contactList, Scanner scanner) {
        
        scanner.nextLine();
        
        System.out.println("Enter name to search : ");
        String name = scanner.nextLine();
        
        Contact contact = contactList.SearchContact(name);
        
        if(contact!=null){
            String email = contact.getEmail();
            System.out.println("-----------------------------------");
            System.out.println(String.format("%-20s%-15s%-50s",contact.getName(),contact.getPhoneNumber(),email==null? "N/A":email));
            System.out.println("-----------------------------------");
        }else{
            System.out.println("Not Found !!");
        }
    }

    private static void deleteContact(ContactList contactList, Scanner scanner) {
        System.out.println("Enter Index No :");
        int index = scanner.nextInt();
        contactList.removeContact(index);
        System.out.println("Contact remove sucessfuly....");
    }
}
