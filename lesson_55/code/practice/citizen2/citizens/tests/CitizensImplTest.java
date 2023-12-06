package practice.citizen2.citizens.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.citizen2.citizens.dao.Citizens;
import practice.citizen2.citizens.dao.CitizensImpl;
import practice.citizen2.citizens.dao.CitizensImplTreeSet;
import practice.citizen2.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CitizensImplTest {

    Citizens citizens   ;
    static LocalDate now = LocalDate.now();


    @BeforeEach
    void setUp() {
        citizens = new CitizensImplTreeSet(List.of(
                new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(2, "John", "Smith", now.minusYears(20)),
                new Person(3, "Marry", "Jackson", now.minusYears(23)),
                new Person(4, "Bryce", "Willis", now.minusYears(25))
        ));

    }
    @Test
    void addTest() {
        assertFalse(citizens.add(null));
        assertFalse(citizens.add(new Person(2, "John", "Smit", now.minusYears(20))));
        assertEquals(4, citizens.size());
        assertTrue(citizens.add(new Person(5, "Jack", "Willis", now.minusYears(25))));
        assertEquals(5, citizens.size());
    }

    @Test
    void removeTest() {
        assertFalse(citizens.remove(5)); //удаляем отсутствующий элемент
        assertEquals(4, citizens.size());
        assertTrue(citizens.remove(4));
        assertEquals(3, citizens.size());

    }

    @Test
    void findTest() {
        Person person = citizens.find(1);
        assertEquals(1, person.getId());
        assertEquals("Peter", person.getFirstName());
        assertEquals("Jackson", person.getLastName());
        assertEquals(23 , person.getAge());
        assertNull(citizens.find(5)); // не будет найден отсутствующий, а метод вернет null
    }

    @Test
    void findByLastNameTest() { // могут быть однофамильцы
        Iterable<Person> persons = citizens.find("Jackson");
        // перенесем полученных в рез-те поиска в ArrayList
        List<Person> actual = new ArrayList<>();
        for (Person person : persons) {
            actual.add(person);
        }
        Collections.sort(actual); // сортируем по id
        List<Person> expected = List.of (
                new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(3, "Mary", "Jackson",now.minusYears(23))
        );
        assertIterableEquals(expected, actual);

    }

    @Test
    void findByAgeRangeTest() {
        Iterable<Person> persons = citizens.find(20, 23)    ;
        // перенесем полученных лист ArrrayList
        List<Person> actual = new ArrayList<>();
        for (Person person : persons) {
            actual.add(person);
        }
        Collections.sort(actual);// произошла сортировка по дефолту (по ID);
        List<Person> expected = List.of(
                new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(2, "John", "Smith", now.minusYears(20)),
                new Person(3, "Marry", "Jackson", now.minusYears(23))
        );
        assertIterableEquals(expected, actual);
    }

    @Test
    void getAllPersonsSortedByIdTest() {
        // что метод отберет все персоны, что все они отсортированны по ID
        // id текущего меньше id следующего
        Iterable<Person> persons = citizens.getAllPersonsSortedById();
        int id = -1;
        int count = 0;
        for (Person person : persons) {
            count++;
            assertTrue(person.getId() > id); // следующий id больше предыдущего
            id = person.getId();
        }
        assertEquals(count, citizens.size());
    }

    @Test
    void getAllPersonsSortedByAgeTest() {
        Iterable<Person> persons = citizens.getAllPersonsSortedByAge();
        int age = -1;
        int count = 0;
        for (Person person : persons) {
            count++;
            assertTrue(person.getAge() >= age); // следующий id больше предыдущего
            age = person.getAge();
        }
        assertEquals(count, citizens.size());
    }

    @Test
    void getAllPersonsSortedByLastNameTest() {
        Iterable<Person> persons = citizens.getAllPersonsSortedByLastName();
        String lastName = "";
        int count = 0;
        for (Person person : persons) {
            count++;
            assertTrue(person.getLastName().compareTo(lastName) >= 0); // фамилия больше или равно нулю по алфавиту
            lastName = person.getLastName();
        }
        assertEquals(count, citizens.size());
    }
    @Test
    void sizeTest() {
        assertEquals(4, citizens.size());
    }
}