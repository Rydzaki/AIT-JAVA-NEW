package home_work_55.company2.company.model;

public class Worker extends Employee {

    private double grade;

    public Worker(int id, String firstName, String lastName, int ege, double hours, double grade, int experience, int education) {
        super(id, firstName, lastName, ege, hours, experience, education);
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
