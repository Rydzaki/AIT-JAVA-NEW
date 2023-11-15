package practice_1411.company;

import practice_1411.company.model.Employee;
import practice_1411.company.model.Manager;
import practice_1411.company.model.SalesManager;
import practice_1411.company.model.Worker;
import practice_1411.company.dao.CompanyArrayListImpl;

import java.util.*;

public class EmployeeAppl  {

    public static void main(String[] args) {

        Employee[] empl = new Employee[5];
        empl[0] = new Manager(100, "John", "Smith", 45, 160, 5000, 5, 3, 1);
        empl[1] = new SalesManager(101, "Anna", "Black", 36, 160, 25000, 0.1, 10, 2);
        empl[4] = new SalesManager(104, "Irina", "Grey", 33, 160, 24000, 0.1, 5, 2);
        empl[2] = new SalesManager(102, "Thomas", "White", 28, 160, 30000, 0.1, 5, 1);
        empl[3] = new Worker(103, "Gans", "Bauer", 30, 160, 5, 4, 3);

        double total = totalSalary(empl); // вызываем метод для расчета ЗП
        System.out.println("Total salary "+ total);
        double average = averageAge(empl);
        System.out.println("Average age "+ average);

        System.out.println(totalSales(empl));

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(empl));
       // employeeList.add(empl[4]);
        Collections.sort(employeeList);
        System.out.println("============================");
        for (Employee e : employeeList) {
            System.out.println(e + " | ");

        }


        for (Employee e : empl) {


        }

    }
    private static double totalSalary(Employee[] empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null){
                sum += empl[i].calcSalary();
            }
        }
        return sum;

    }
    private static double averageAge (Employee[] empl){
        double average = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null){
                average += empl[i].getEge();
            }
        }
        return average/empl.length;
    }

    private static double totalSales(Employee[] empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] instanceof SalesManager){
                SalesManager salesManager = (SalesManager) empl[i];
                sum += salesManager.getSalesValue();
            }
        }
        return sum;
    }




}
