package HomeWork.student;

import HomeWork.student.model.Student;

public class StudentAppl {
    public static void main(String[] args) {
        Student s1 = new Student(007, "James", "Bond", 1962, "Computer Science");
        Student s2 = new Student(321, "Sergey", "Korolev", 1907, "Rocket Science");

        s1.display();
        s2.display();
        System.out.println();

        s1.study();
        s1.vocation();
        s1.exam();
        System.out.println();
        s2.study();
        s2.vocation();
        s2.exam();
    }
}
