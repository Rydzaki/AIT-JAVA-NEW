package practice_18_10.company.model;

public class Manager extends Employee {

    private double baseSalary;
    private int grade;


    public Manager(int id, String firstName, String lastName, int ege, double hours, double baseSalary, int grade) {
        super(id, firstName, lastName, ege, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double calcSalary(){
        double salary = baseSalary + grade * hours;
        return salary;
    }

}
