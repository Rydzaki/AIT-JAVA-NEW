package practice_18_10.company.dao;


//    - добавить сотрудника
//    - удалить сотрудника
//    - найти сотрудника
//    - кол-во сотрудников
//    - ФОТ
//    - средняя з/п
//    - объем продаж
//    - напечатать список сотрудников

import practice_18_10.company.model.Employee;

public interface Company {

    // объявляем методы, только сигнатуры без тела метода

    boolean addEmployee(Employee employee);
    Employee removeEmployee(int id);
    Employee findEmployee(int id);
    int quantity();
    double totalSalary(); // ФОТ
    double avgSalary(); // средняя ЗП по компании
    double totalSales(); // объем продаж
    void printEmployees();

    // ---------
    // список работников у которых отработано больше часов чем...
    Employee[] findEmployeesHoursGreaterThan(int hours);


    // список работников у которых ЗП в интревале (мин - макс)

    Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary);





}
