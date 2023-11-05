package practice.user_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    final String email = "peter@gmail.com"; //final переменна стала статическая
    final String passwords = "12345Az!";

    @BeforeEach
    void setUp() {
        user = new User(email, passwords); //перед каждым тестом у нас устанавливается согласно заданным параметрам
    }

    @Test
    void testCorrectEmail() {
        user.setEmail("peter@yahoo.com"); // устанавливаем новый емаил
        assertEquals("peter@yahoo.com", user.getEmail());
    }

    @Test
    void setWithoutAt() {
        user.setEmail("vasya.yahoo.com");
        assertEquals(email, user.getEmail()); // если они совпадут это значит что емаил валидаци не прошел
    }


}