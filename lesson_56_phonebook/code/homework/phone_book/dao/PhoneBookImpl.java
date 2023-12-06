package homework.phone_book.dao;

import homework.phone_book.model.Contact;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBookImpl implements PhoneBook{

    private List<Contact> contactListName; // список всех наших контактов по именам
    private HashSet<Contact> contactListNumber; // список по номерам
    public PhoneBookImpl(){
        contactListName = new ArrayList<>();
        contactListNumber = new HashSet<>();

    }
    public PhoneBookImpl(List<Contact> contacts){
        this();
        for(Contact c : contacts){
            addContact(c);
        }
    }
    @Override
    public boolean addContact(Contact contact) {
        return contact != null && contactListName.add(contact) && contactListNumber.add(contact);
    }

    @Override
    public void printAllContacts() {
        for (Contact contact : contactListName) {
            System.out.println(contact);
        }
    }
    @Override
    public List<Contact> findContact(String name) {
        List<Contact> foundCont = contactListName.stream()
                .filter(contact -> contact.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
//        foundCont.forEach(System.out::println);
        return foundCont;
    }

//        Contact from = new Contact(name, null);
//        Contact to = new Contact(name + Character.MAX_VALUE, null);
//
//        TreeSet<Contact> findCont = new TreeSet<>(contactListName.subSet(from, to));
//        return findCont.toArray(new Contact[0]);


//        Contact pattern = new Contact(name, null);
//        List<Contact> numbers = new ArrayList<>();
//        for (Contact c: contactListName) {
//            if(c.equals(pattern)){
//                numbers.add(c);
//            }
//        }
//        return numbers.toArray(new Contact[0]);

    @Override
    public boolean removeContact(Contact contact) {
        List<Contact> contactsToRemove = findContact(contact.getName());
        boolean removed = false;
        for (Contact c : contactsToRemove) {
            if(c.getNumberOfPhone().equals(contact.getNumberOfPhone())) {
                removed |= contactListName.remove(c);
                removed |= contactListNumber.remove(c);
            }
        }
        return removed;
    }

    @Override
    public Iterator<Contact> iterator() {
        return contactListName.iterator();
    }
}
