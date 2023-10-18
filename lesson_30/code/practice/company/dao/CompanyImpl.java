package practice.company.dao;

import practice.company.model.Employee;



public class CompanyImpl implements Company {

    // поля которые описывают компанию
    private Employee[] employees; // создали массив где хранятся все сотрудники
    private int size; // текущий размер компании

    // контсруктор

    public CompanyImpl(int capacity){
        employees = new Employee[capacity]; // максимальное число сотрудников которе можем представить
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double avgSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public void printEmployees() {

    }

}
