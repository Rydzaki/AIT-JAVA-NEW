package home_work.student;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birtDay;
    private String course;
    private int groupNum;
    private String country;
    private char gender;

    public Student(int id, String firstName, String lastName, LocalDate birtDay, String course, int groupNum, String country, char gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDay = birtDay;
        this.course = course;
        this.groupNum = groupNum;
        this.country = country;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(LocalDate birtDay) {
        this.birtDay = birtDay;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birtDay=" + birtDay +
                ", course='" + course + '\'' +
                ", groupNum=" + groupNum +
                ", country='" + country + '\'' +
                ", gender=" + gender +
                '}';
    }
    public int getAge(){
        int age = (int) ChronoUnit.YEARS.between(birtDay, LocalDate.now());
        return age;
    }

}
