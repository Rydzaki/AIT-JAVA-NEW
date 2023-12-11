package home_work_55.company2.company.model;

public class SalesManager  extends Employee {
    private double salesValue;
    private double percent;


    public SalesManager(int id, String firstName, String lastName, int ege, double hours, double salesValue, double percent, int experience, int education) {
        super(id, firstName, lastName, ege, hours, experience, education);
        this.salesValue = salesValue;
        this.percent = percent;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double calcSalary() {
        double salary = salesValue * percent;
        return salary;
    }
}