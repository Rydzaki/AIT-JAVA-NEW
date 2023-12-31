package practice_1411.company.model;

public class Worker extends Employee {

    private double grade;

    public Worker(int id, String firstName, String lastName, int ege, double hours, double grade) {
        super(id, firstName, lastName, ege, hours);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    @Override
    public double calcSalary() {
        double salary = hours * grade;
        return salary;
    }
}
