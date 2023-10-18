package practice_18_10.company.dao;

import practice_18_10.company.model.Employee;
import practice_18_10.company.model.SalesManager;


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
        // не добавляем нулл, не превышаем копасити, недобавляем уже существующий элемент
        if(employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                Employee victim = employees[i]; // убрали найденный элемент в переменную
                employees[i] = employees[size - 1]; //на место найденного поставили последнего заполненного сотрудника
                employees[size -1] = null; //обнулили последнего
                size --;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){      // нашелся элемент массива у которого совпал id
                return employees[i]; // возвращаем найденый элемент
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += employees[i].calcSalary();

        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager){
                SalesManager salesManager = (SalesManager) employees[i]; // провели дайн кастинг
                res += salesManager.getSalesValue();
                //res += (SalesManager) ((SalesManager) employees[i]).getSalesValue();
            }

        }

        return res;
    }

    @Override
    public void printEmployees() {

        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }

    }

}
