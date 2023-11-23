package home_work.citizens.dao;

import home_work.citizens.model.Person;

public interface Citizens{

    boolean add(Person person);
    boolean remove(int id);
    Person find(int id);
    Iterable<Person> find(int minAge, int maxAge);// вернем передираемые данные
    Iterable<Person> find(String lastName);
    Iterable<Person> getAllPersonsSortedById();
    Iterable<Person> getAllPersonsSortedByAge();
    Iterable<Person> getAllPersonsSortedByLastName();
    int size();



}
