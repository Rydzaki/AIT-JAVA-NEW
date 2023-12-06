package home_work.company_3_stream.dao;

import home_work.company_3_stream.model.Employee;
import home_work.company_3_stream.model.SalesManager;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class CompanyStrimImpl implements Company {

    private Set<Employee> employees; // вместо List создаем Set
    int capacity; // вместимость компании


    public CompanyStrimImpl(int capacity) {
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
        return employees.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst() // Возвращает значение, Optional описывающее первый элемент этого потока, или пустое значение, Optional если поток пуст.
                .orElse(null);

//        for (Employee e : employees) { // e - это employee из списка employees
//            if (e.getId() == id) {
//                return e; // вернули найденный элемент
//            }
//        }
//        return null;
    }
    //O(n)
    @Override
    public int quantity() {
        return employees.size();
    }
    //O(n)
    @Override
    public double totalSalary() {
        return employees.stream()
                .map(Employee::calcSalary)
                .reduce(0.0, Double::sum);
//        double res = 0;
//        for (Employee e : employees) {
//            res += e.calcSalary();
//        }
//        return res;
    }
    //O(n)
    @Override
    public double avgSalary() {
        return totalSalary() / employees.size();
    }
    //O(n)
    @Override
    public double totalSales() {
        return employees.stream()
                .filter(employee -> employee instanceof SalesManager)
                .map(employee -> ((SalesManager) employees).getSalesValue())
                .reduce(0.0, Double::sum);
//        double res = 0;
//        for (Employee e : employees) {
//            if(e instanceof SalesManager) { // проверяет принадлежит ли элемент данному типу
//                res += ((SalesManager) e).getSalesValue();
//            }
//        }
//        return res;
    }
    //O(n)
    @Override
    public void printEmployees() {
        employees.forEach(System.out::println); // отправляем все элементы на печать

    }
    //O(n)
    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return findEmployeesByPredicate(e -> e.getHours() >= hours);
    }
    //O(n)
    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate) {
//        return employees.stream()
//                .filter(predicate)
//                .map(Object::toString)
//

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
