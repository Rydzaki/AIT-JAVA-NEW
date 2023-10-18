package prictice.employee.model;

public class Employee {

    //описали поля класса
    private int id;// идентификатор
    private String firstName;
    private String lastName;
    private int ege;
    private double salary;
    private boolean gender; // пол

    // конструктор класса


    public Employee(int id, String firstName, String lastName, int ege, double salary, boolean gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ege = ege;
        this.salary = salary;
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

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("ID: " + id + ", first name: " + firstName + ", last name: "
                + lastName + ", salary: " + salary + ", gender: " + (gender ? "male" : "female"));
    }

    public void work() {
        System.out.println("Employee is working!...");
    }

    public void lunch(){
        System.out.println("Employee eating lunch");
    }
    public void sleep(){
        System.out.println("Employee is sleeping");
    }

}
