package homework.phone_book.model;

import java.util.Objects;

public class Contact implements Comparable<Contact> {

    private String name;
    private String numberOfPhone;

    public Contact(String name, String numberOfPhone) {
        this.name = name;
        this.numberOfPhone = numberOfPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contact contact) {
        return this.name.compareTo(contact.name);
    }
}
