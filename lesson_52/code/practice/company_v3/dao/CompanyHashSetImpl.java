package practice.company_v3.dao;

import practice.company_v3.model.Employee;
import practice.company_v3.model.SalesManager;

import java.util.*;
import java.util.function.Predicate;

public class CompanyHashSetImpl implements Company {

    private Set<Employee> employees; // вместо List создаем Set
    int capacity; // вместимость компании


    public CompanyHashSetImpl(int capacity) {
        this.capacity = capacity; // это ограничение по кол-ву сотрудников в компании
        employees = new HashSet<>(); // длину (размер) указывать не надо
    }
    // O(1)
    @Override
    public boolean addEmployee(Employee employee) {
        // не добавляем null, не превышаем capacity, не добавляем уже существующий элемент
        if (employee == null || employees.size() == capacity) {
            return false;
        }
        return employees.add(employee); // добавили сотрудника (элемент множества)
        // операция добавления  и удаления из множества имеет сложность вычислительную O(1)
    }
    //O(1)
    @Override
    public Employee removeEmployee(int id) {
        Employee victim = findEmployee(id);
        employees.remove(victim);
        return victim;

        // множества не содержат в общем случае элемент NULL, поэтому проверка на наличие нул не нужна
    }
    //O(n)
    @Override
    public Employee findEmployee(int id) {
        for (Employee e : employees) { // e - это employee из списка employees
            if (e.getId() == id) {
                return e; // вернули найденный элемент
            }
        }
        return null;
    }
    //O(n)
    @Override
    public int quantity() {
        return employees.size();
    }
    //O(n)
    @Override
    public double totalSalary() {
        double res = 0;
        for (Employee e : employees) {
            res += e.calcSalary();
        }
        return res;
    }
    //O(n)
    @Override
    public double avgSalary() {
        return totalSalary() / employees.size();
    }
    //O(n)
    @Override
    public double totalSales() {
        double res = 0;
        for (Employee e : employees) {
            if(e instanceof SalesManager) { // проверяет принадлежит ли элемент данному типу
                res += ((SalesManager) e).getSalesValue();
            }
        }
        return res;
    }
    //O(n)
    @Override
    public void printEmployees() {
        employees.forEach(e -> System.out.println(e)); // отправляем все элементы на печать

    }
    //O(n)
    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return findEmployeesByPredicate(e -> e.getHours() >= hours);
    }
    //O(n)
    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate) {
        List<Employee> res = new ArrayList<>();
        for (Employee emplo: employees) {
            if(predicate.test(emplo)){
                res.add(emplo);
            }
        }
        return res.toArray(new Employee[0]);// новинка

    }
    //O(n)
    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return findEmployeesByPredicate(e -> e.calcSalary()>= minSalary && e.calcSalary() < maxSalary);
    }
}
