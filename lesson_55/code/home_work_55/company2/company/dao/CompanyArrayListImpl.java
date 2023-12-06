//package home_work_55.company2.company.dao;
//
//import home_work_55.company2.company.model.Employee;
//import home_work_55.company2.company.model.SalesManager;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CompanyArrayListImpl implements Company {
//
//    // поля которые описывают компанию
////    private Employee[] employees; // создали массив где хранятся все сотрудники
////    private int size; // текущий размер компании
//
////    public CompanyImpl(int capacity){
////        employees = new Employee[capacity]; // максимальное число сотрудников которе можем представить
////    }
//
//
//    List<Employee> employees; // вместо массива делаем Лист
//    int capacity; // вместимость компании
//
//    public CompanyArrayListImpl(int capacity) {
//        employees = new ArrayList<>(); // длинну указывать не надо
//        this.capacity = capacity; // ограничения по набору сотрудников компании
//    }
//
//    // O(n)
//    @Override
//    public boolean addEmployee(Employee employee) {
//        if (employee == null || employees.size() == capacity || findEmployee(employee.getId()) != null) {
//            return false;
//        }
//        employees.add(employee); // добавили в список сотрудника
//        return true;
//    }
//
//    // O(n)
//    @Override
//    public boolean removeEmployee(int id) {
//        Employee victim = findEmployee(id);
//        if (victim != null) {
//            employees.remove(victim);
//            return victim;
//        }
//        return null;
//    }
//
//    //O(n)
//    @Override
//    public Employee findEmployee(int id) {
//
//        for (Employee e : employees) { // e - это employee из списка employees
//            if (e.getId() == id) {
//                return e; // вернули найденный элемент
//            }
//        }
//        return null;
//    }
//
//    //O(1)
//    @Override
//    public int quantity() {
//        return employees.size(); // вернуди длинну списка
//    }
//
//    @Override
//    public double totalSalary() {
//        double res = 0;
//        for (Employee e : employees) {
//            res += e.calcSalary();
//
//        }
//        return res;
//    }
//
//    //O(n) - линейная
//    @Override
//    public double avgSalary() {
//        return totalSalary() / employees.size();
//    }
//
//    //O(n)
//    @Override
//    public double totalSales() {
//        double res = 0;
//
//        for (Employee e : employees) {
//            if (e instanceof SalesManager salesManager) {
//                res += salesManager.getSalesValue();
//
//            }
//
//        }
//
//        return res;
//    }
//
//    //O(n)
//    @Override
//    public void printEmployees() {
//        for (Employee e : employees) {
//            System.out.println(e);
//        }
//
//    }
//
//    @Override
//    public Employee[] findEmployeesHoursGreaterThan(int hours) {
//        int count = 0;
//        for (Employee e : employees) {
//            if (e.getHours() > hours) {
//                count++;
//            }
//        }
//        Employee[] res = new Employee[count];
//        count = 0;
//        for (Employee e : employees) {
//            if (e.getHours() > hours) {
//                res[count] = employees.get(count);
//                count++;
//            }
//        }
//        return res;
//    }
//
//    @Override
//    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
//        int count = 0;
//        for (Employee e : employees) {
//            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
//                count++;
//            }
//        }
//        Employee[] res = new Employee[count];
//        count = 0;
//        for (Employee e : employees) {
//            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
//                res[count] = e;
//                count++;
//            }
//        }
//        return res;
//
//    }
//}
