package home_work.residents;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Resident {

    private String lastName;
    private String firstName;
    private String sex;
    private LocalDate birthday;
    private Integer floor;
    private int apartmentNumber;

    public Resident(String lastName, String firstName, String sex, LocalDate birthday, Integer floor, int apartmentNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.sex = sex;
        this.birthday = birthday;
        this.floor = floor;
        this.apartmentNumber = apartmentNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
    public int getAge(){
        // LocalDate currDay = LocalDate.now();
        int age = (int) ChronoUnit.YEARS.between(birthday, LocalDate.now());
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resident resident = (Resident) o;
        return Objects.equals(lastName, resident.lastName) && Objects.equals(firstName, resident.firstName) && Objects.equals(birthday, resident.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, birthday);
    }

    @Override
    public String toString() {
        return "Resident{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", floor=" + floor +
                ", apartmentNumber=" + apartmentNumber +
                '}';
    }
}
