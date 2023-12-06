package homework.phone_book.dao;

import homework.phone_book.model.Contact;

import java.util.List;

public class PhoneBookAppl {
    public static void main(String[] args) {
        PhoneBook myPhomeBook = new PhoneBookImpl();

        myPhomeBook.addContact(new Contact("Ivanov", "+79991234567"));
        myPhomeBook.addContact(new Contact("Petrov", "+79991234568"));
        myPhomeBook.addContact(new Contact("Semenov", "+79991234569"));
        myPhomeBook.addContact(new Contact("Itin", "+79911234567"));
        myPhomeBook.addContact(new Contact("Hoffman", "+79921234567"));
        myPhomeBook.addContact(new Contact("Lee", "+79931234567"));
        myPhomeBook.addContact(new Contact("Lee", "+79941234567"));

        myPhomeBook.findContact("Lee");

    }



}
