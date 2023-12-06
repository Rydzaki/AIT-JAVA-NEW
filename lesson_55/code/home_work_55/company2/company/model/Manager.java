package home_work_55.company2.company.model;

public class Manager extends Employee {

    private double baseSalary;
    private int grade;


    public Manager(int id, String firstName, String lastName, int ege, double hours, double baseSalary, int grade, int experience, int education) {
        super(id, firstName, lastName, ege, hours, experience, education);
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
