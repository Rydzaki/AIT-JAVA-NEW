package practice.citizen2.citizens.dao;

import practice.citizen2.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CitizensImplTreeSet implements Citizens{


    // fields
    private TreeSet<Person> idList; // список граждан по id
    private TreeSet<Person> lastNameList; // список граждан по фамилиям
    private TreeSet<Person> ageList; // список граждан по годам

    private static Comparator<Person> lastNameComparator = (p1, p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName()); // сортировка по фамилиям
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id если одинаковые фамилии
    };

    private static Comparator<Person> ageComparator = (p1, p2) -> {
        int res = Integer. compare(p1.getAge(), p2.getAge()); // портировка по годам
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId());
    };

    public CitizensImplTreeSet() {
        idList = new TreeSet<>(); // создаемм пустой список
        lastNameList = new TreeSet<>(lastNameComparator); // защет сомпаратора поддерживается уникальность и сортируемость множества
        ageList = new TreeSet<>(ageComparator);
    }

    public CitizensImplTreeSet(List<Person> citizens) {
        this(); // вызывает пустого конструктора
        for (Person person : citizens) {
            citizens.forEach(p -> add(p));
        }
    }

    // O(log(n))
    @Override
    public boolean add(Person person) {
        return person != null && idList.add(person) && lastNameList.add(person) && ageList.add(person);
    }
    // O(log(n))
    @Override
    public boolean remove(int id) {
        Person person = find(id);

        return person != null && idList.remove(person) && lastNameList.remove(person) && ageList.remove(person);
    }

    @Override
    public Person find(int id) {
        Person pattern = new Person(id, null, null, null);
        Person person = idList.ceiling(pattern); // поиск объекта в массиве
        return pattern.equals(person) ? person : null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person from = new Person(idList.first().getId() - 1, null, null, now.minusYears(minAge));
        Person to = new Person(idList.last().getId() + 1, null, null, now.minusYears(maxAge));
        return ageList.subSet(from, to); // берем подмножество
    }

    @Override
    public Iterable<Person> find(String lastName) {
        Person from = new Person(Integer.MIN_VALUE, null, lastName, null);
        Person to = new Person(Integer.MAX_VALUE, null, lastName, null);
        return lastNameList.subSet(from, to);
    }

    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return idList;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        return ageList;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return lastNameList;
    }

    @Override
    public int size() {
        return idList.size();
    }
}
