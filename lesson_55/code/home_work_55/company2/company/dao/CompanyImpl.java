//package home_work_55.company2.company.dao;
//
//import home_work_55.company2.company.model.Employee;
//import home_work_55.company2.company.model.SalesManager;
//
//
//public class CompanyImpl implements Company {
//
//    // поля которые описывают компанию
//    private Employee[] employees; // создали массив где хранятся все сотрудники
//    private int size; // текущий размер компании
//
//    // контсруктор
//
//    public CompanyImpl(int capacity){
//        employees = new Employee[capacity]; // максимальное число сотрудников которе можем представить
//    }
//
//    @Override
//    public boolean addEmployee(Employee employee) {
//        // не добавляем нулл, не превышаем копасити, недобавляем уже существующий элемент
//        if(employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
//            return false;
//        }
////        employees[size] = employee;
////        size++;
//          employees[size++] = employee; // постфиксная операция
//
//        return true;
//    }
//
//    @Override
//    public boolean removeEmployee(int id) {
//        for (int i = 0; i < size; i++) {
//            if (employees[i].getId() == id){
//                Employee victim = employees[i]; // убрали найденный элемент в переменную
////                employees[i] = employees[size - 1]; //на место найденного поставили последнего заполненного сотрудника
////                employees[size -1] = null; //обнулили последнего
////                size --;
//                  employees[i] = employees[--size]; //префиксная операция [size -1] и уменьшая size на 1
//                  employees[size] = null;
//
//                return victim;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public Employee findEmployee(int id) {
//        for (int i = 0; i < size; i++) {
//            if (employees[i].getId() == id){      // нашелся элемент массива у которого совпал id
//                return employees[i]; // возвращаем найденый элемент
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public int quantity() {
//        return size;
//    }
//
//    @Override
//    public double totalSalary() {
//        double res = 0;
//        for (int i = 0; i < size; i++) {
//            res += employees[i].calcSalary();
//
//        }
//        return res;
//    }
//
//    @Override
//    public double avgSalary() {
//        return totalSalary() / size;
//    }
//
//    @Override
//    public double totalSales() {
//        double res = 0;
//        for (int i = 0; i < size; i++) {
//            if(employees[i] instanceof SalesManager){
//                SalesManager salesManager = (SalesManager) employees[i]; // провели дайн кастинг
//                res += salesManager.getSalesValue();
//                //res += (SalesManager) ((SalesManager) employees[i]).getSalesValue();
//            }
//
//        }
//
//        return res;
//    }
//
//    @Override
//    public void printEmployees() {
//
//        for (int i = 0; i < size; i++) {
//            System.out.println(employees[i]);
//        }
//
//    }
////Для выборки элементов из массива, удовлетворяющих заданному условию, надо:
////- сначала подсчитать количество элементов массива, удовлетворяющих условию.
////- потом создать массив под это количество,
////- и только потом его заполнить.
//
//    @Override
//    public Employee[] findEmployeesHoursGreaterThan(int hours) {
//        // считаем стколько будет элементов массива удовлетворяющих условиям
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            if (employees[i].getHours() > hours){
//                count++;
//
//            }
//        }
//        Employee[] res = new Employee[count]; // создаем массив размером каунт и заполняем
//        for (int i = 0, j = 0; j < res.length; i++) {
//            if (employees[i].getHours() > hours){
//                res[j++] = employees[i];
//            }
//        }
//        return res; // возвращаемый массив
//    }
//
//    @Override
//    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary){
//                count++;
//            }
//        }
//        Employee[] res = new Employee[count]; // создаем массив размером каунт и заполняем
//        for (int i = 0, j = 0; j < res.length; i++) {
//            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary){
//                res[j++] = employees[i];
//            }
//        }
//
//        return res;
//    }
//
//}
