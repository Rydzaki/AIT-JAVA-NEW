package prictice.employee;

import prictice.employee.model.Employee;

public class FirmaAppl {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "John", "Smith", 36, 24000, true);
        Employee e2 = new Employee(2, "Marta", "Tompsom", 25, 24000, false);

        e1.display();
        e2.display();


        double totalSalary = e1.getSalary() + e2.getSalary();
        System.out.println(totalSalary);

        e1.work();
        e1.lunch();
        e1.sleep();
    }

}
