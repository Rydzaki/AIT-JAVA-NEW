package homework.phone_book;

import homework.phone_book.dao.PhoneBook;
import homework.phone_book.dao.PhoneBookImpl;
import homework.phone_book.model.Contact;

import java.util.List;

public class PhoneBookAppl {
    public static void main(String[] args) {
        PhoneBook myPhoneBook;

        myPhoneBook = new PhoneBookImpl(List.of(
        (new Contact("Ivanov", "+1111111111")),
        (new Contact("Ivanov", "+2222222222")),
        (new Contact("Sidorov", "+79961234567")),
        (new Contact("Gamzatov", "+79971234567")),
        new Contact("Ushakov", "+79981234567"))
        );
        System.out.println("===============PRINT METOD================");
        myPhoneBook.printAllContacts();

        System.out.println();
        System.out.println("=============PRINT FOR EARCH================");
        for (Contact c: myPhoneBook){
            System.out.println(c + " | ");
        }
        System.out.println();
        System.out.println("================Find=======================");
        List<Contact> foundContact = myPhoneBook.findContact("ivanov");
        foundContact.forEach(System.out::println);

        System.out.println("==============Remove + print==============");
        myPhoneBook.removeContact(new Contact("Ivanov", "+1111111111"));
        myPhoneBook.printAllContacts();


    }
}
