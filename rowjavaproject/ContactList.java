
package rowjavaproject;

import java.util.ArrayList;


public class ContactList {
    
    private ArrayList<Contact> contacts;
    
    public ContactList(){
        contacts = new ArrayList<>();
    }
    
    public void createContact(Contact contact){
        contacts.add(contact);
    }
    
    public int getTotalContact(){
        return contacts.size();
    }
    
    public void removeContact(int index){
        
        contacts.remove(index);
        
    }
    
    public Contact SearchContact(String name){
        
        for(Contact c : contacts){
            if(c.getName().equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }
    
    public ArrayList<Contact> getContacts(){
        return contacts;
    }
}
