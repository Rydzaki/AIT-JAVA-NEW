package home_work.student;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class DekanatAppl {

//     Сделать списки студентов по курсам, по группам, отсортированные по фамилиям и возрасту. Сколько студентов мужчин? Сколько женщин? Какой у них средний возраст по курсу? По всем студентам?
    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>(List.of(
                new Student(111, "Ivan", "Ivanov", LocalDate.of(1990, 12, 23), "Programming", 114, "UK", 'M'),
                new Student(222, "Peter", "Petrov", LocalDate.of(1989, 3, 12), "Math", 225, "RU", 'M'),
                new Student(333, "Oksana", "Ivina", LocalDate.of(1987, 4, 15), "QA", 313, "KZ", 'F'),
                new Student(444, "Jane", "Lee", LocalDate.of(1992, 12, 25), "Math", 115, "CH", 'F'),
                new Student(555, "Anna", "Krot", LocalDate.of(1964, 5, 5), "Testing", 415, "FR", 'F'),
                new Student(666, "Anton", "Sidorov", LocalDate.of(1992, 5, 3), "Programming", 314, "US", 'M'),
                new Student(777, "Lily", "Josh", LocalDate.of(2004, 8, 12), "DevOps", 145, "GR", 'F'),
                new Student(888, "Peter", "Sivov", LocalDate.of(2000, 9, 1), "Testing", 235, "RU", 'M'),
                new Student(999, "Joy", "Bush", LocalDate.of(1989, 3, 12), "QA", 313, "US", 'M'),
                new Student(119, "Si", "Pin", LocalDate.of(2010, 6, 3), "DevOps", 146, "CN", 'M'),
                new Student(229, "Don", "Jons", LocalDate.of(1987, 1, 28), "Net", 545, "UK", 'M'),
                new Student(339, "Fia", "Sua", LocalDate.of(1999, 4, 15), "Net", 155, "RU", 'F')
        ));
        System.out.println("-----------------------------");
        studentList.forEach(System.out::println);
        System.out.println("=================Sorted===================");
        List<Student> listCourseName = studentList.stream()
                .sorted(Comparator.comparing(Student::getCourse).thenComparing(Student::getLastName))
                .toList();
        listCourseName.forEach(System.out::println);
        System.out.println("--------------------sort by course and age-----------------------");
        List<Student> listCourseAge = studentList.stream()
                .sorted(Comparator.comparing(Student::getCourse).thenComparing(Student::getAge))
                .toList();
        listCourseAge.forEach(System.out::println);

        System.out.println("=================Average==========================");
        Double listAvg  = studentList.stream()
                        .mapToInt(Student::getAge)
                                .summaryStatistics()
                                        .getAverage();

        System.out.printf("Average age is: %.2f%n", listAvg);

        System.out.println("=================Average by course==========================");
        Map<String, Double> listAvgCourse  = studentList.stream()
                .collect(Collectors.groupingBy(Student::getCourse, Collectors.averagingDouble(Student::getAge)));
        // 
        // todo listAvgCourse.forEach();

        System.out.println("==============Female================");
        long sumFemale = studentList.stream()
                .filter(student -> student.getGender() =='F')
                        .count();
        System.out.println(sumFemale);

        System.out.println("==============Male================");
        long sumMale = studentList.stream()
                .filter(student -> student.getGender() =='M')
                .count();
        System.out.println(sumMale);

        Map<Character, List<Student>> gender = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender));
       // todo как все вывести на печать???

        int women = 0;
        int men = 0;
        for (Character c:gender.keySet()){
            if(c.equals('F')){
                women+= gender.get(c).size();
            }
            if (c.equals('M')){
                men+= gender.get(c).size();
            }
        }
        System.out.println("Women = "+ women+ "; "+ "Men = "+ men);




    }
}
