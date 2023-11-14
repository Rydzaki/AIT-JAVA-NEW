package practice_1411.user;

public class UserAppl {
    public static void main(String[] args) {

        User user = new User("ushakov@mail.ru", "ZZZZZZZZZZZZZZZZ");
        User user1 = new User("qwqeeqe@gmail.com", "Qwerty!234");

        System.out.println(user);
        System.out.println(user1);
        System.out.println("-------------------------------------------------");
        user.setEmail("asdf@mail.ru");
        user.setPassword("qwerty");
        System.out.println(user);
        System.out.println("-------------------------------------------------");
        user1.setPassword("1221As8383 @");
        user1.setEmail("@123mail.ru");
        System.out.println(user1);
        System.out.println("-------------------------------------------------");



    }
}

