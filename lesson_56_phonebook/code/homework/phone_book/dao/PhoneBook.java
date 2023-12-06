package homework.phone_book.dao;

import homework.phone_book.model.Contact;

import java.util.List;

public interface PhoneBook extends Iterable<Contact> {

    boolean addContact(Contact contact);
    void printAllContacts();
    List<Contact> findContact(String name);
    boolean removeContact(Contact contact);

}
