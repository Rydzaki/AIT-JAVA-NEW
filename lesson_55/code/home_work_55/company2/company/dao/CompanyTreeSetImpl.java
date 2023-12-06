package home_work_55.company2.company.dao;

import home_work_55.company2.company.model.Employee;

import java.util.List;
import java.util.TreeSet;

import static java.awt.AWTEventMulticaster.add;

public class CompanyTreeSetImpl implements Company{

    TreeSet<Employee> employees; // вместо массива делаем Лист
    int capacity; // вместимость компании

    public CompanyTreeSetImpl(int capacity) {
        employees = new TreeSet<>(); // длинну указывать не надо
        this.capacity = capacity; // ограничения по набору сотрудников компании
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return employee != null && employees.add(employee);
    }

    @Override
    public boolean removeEmployee(int id) {
        Employee employee = findEmployee(id);
        return  employee != null && employees.remove(employee);
    }

    @Override
    public Employee findEmployee(int id) {
        for (Employee employee : employees) {
            if(employee.getId() == id){
                return employee;
            }
        };
        return null;
    }

    @Override
    public int quantity() {
        return employees.size();
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
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return new Employee[0];
    }
}
