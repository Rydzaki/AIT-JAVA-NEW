//package home_work_55.citizens2_1.citizens.dao;
//
//import home_work_55.citizens2_1.citizens.model.Person;
//
//import java.time.LocalDate;
//import java.util.*;
//
//public class CitizensHasSetImpl implements Citizens{
//
//    // fields
//    private HashSet<Person> idList; // список граждан по id
//    private HashSet<Person> lastNameList; // список граждан по фамилиям
//    private HashSet<Person> ageList; // список граждан по годам
//
//    private static Comparator<Person> lastNameComparator = (p1, p2) -> {
//        int res = p1.getLastName().compareTo(p2.getLastName()); // сортировка по фамилиям
//        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id если одинаковые фамилии
//    };
//
//    private static Comparator<Person> ageComparator = (p1, p2) -> {
//        int res = Integer. compare(p1.getAge(), p2.getAge()); // портировка по годам
//        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId());
//    };
//
//    public CitizensHasSetImpl() {
//        idList = new HashSet<>(); // создаемм пустой список
//        lastNameList = new HashSet<>((Collection) lastNameComparator); // защет сомпаратора поддерживается уникальность и сортируемость множества
//        ageList = new HashSet<>((Collection) ageComparator);
//    }
//    public CitizensHasSetImpl(List<Person> citizens) {
//        this(); // вызывает пустого конструктора
//        for (Person person : citizens) {
//            citizens.forEach(p -> add(p));
//        }
//    }
//    @Override
//    public boolean add(Person person) {
//        return person != null && idList.add(person) && lastNameList.add(person) && ageList.add(person);
//    }
//    // O(log(n))
//    @Override
//    public boolean remove(int id) {
//        Person person = find(id);
//        return person != null && idList.remove(person) && lastNameList.remove(person) && ageList.remove(person);
//    }
//
//    @Override
//    public Person find(int id) {
//        Person pattern = new Person(id, null, null, null);
//        return idList.contains(pattern) ? pattern : null;
//
////        Person person = idList.contains(pattern); //idList.contains.(pattern); // поиск объекта в массиве
////        return pattern.equals(person) ? person : null;
////    }
//
//    @Override
//    public Iterable<Person> find(int  minAge, int maxAge) {
////        LocalDate now = LocalDate.now();
////        Person from = new Person(idList.().getId() - 1, null, null, now.minusYears(minAge));
////        Person to = new Person(idList.last().getId() + 1, null, null, now.minusYears(maxAge));
//        return idList.stream().filter(p -> p.getLastName().equals()); // берем подмножество
//    }
//
//    @Override
//    public Iterable<Person> find(String lastName) {
//        Person from = new Person(Integer.MIN_VALUE, null, lastName, null);
//        Person to = new Person(Integer.MAX_VALUE, null, lastName, null);
//        return lastNameList.subSet(from, to);
//    }
//
//    @Override
//    public Iterable<Person> getAllPersonsSortedById() {
//        return idList;
//    }
//
//    @Override
//    public Iterable<Person> getAllPersonsSortedByAge() {
//        return ageList;
//    }
//
//    @Override
//    public Iterable<Person> getAllPersonsSortedByLastName() {
//        return lastNameList;
//    }
//
//    @Override
//    public int size() {
//        return idList.size();
//    }
//}