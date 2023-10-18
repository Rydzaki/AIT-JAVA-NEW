package practice_18_10.company.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_18_10.company.dao.Company;
import practice_18_10.company.dao.CompanyImpl;
import practice_18_10.company.model.Employee;
import practice_18_10.company.model.Manager;
import practice_18_10.company.model.SalesManager;
import practice_18_10.company.model.Worker;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] e;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        e = new Employee[4];
        e[0] = new Manager(101, "John", "Smith", 45, 160, 5000, 5);
        e[1] = new SalesManager(102,"Anna", "Black", 36, 160, 25000, 0.1);
        e[2] = new SalesManager(103,"Thomas", "White", 28, 160, 30000, 0.1);
        e[3] = new Worker(104, "Gans", "Bauer", 30, 80, 5);

        // добавим елементы массива в компани
        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);

        }
    }

    @Test
    void addEmployee() {
        //не можем добавить пустого сотрудника (NULL)
        assertFalse(company.addEmployee(null));

        // не можем добавить второй раз уже существующий

        assertFalse(company.addEmployee(e[1]));
        Employee employee1 = new Manager(105, "Ivan", "Dugin", 55, 160, 6000, 6); // создали сотрудника
        assertTrue(company.addEmployee(employee1)); //вставляем нового сотрудника
        assertEquals(5, company.quantity());
        Employee employee2 = new Manager(106, "Piter", "Dugin", 50, 160, 6000, 6); // создали сотрудника
        assertFalse(company.addEmployee(employee2)); // не можем привысить копасити
    }

    @Test
    void removeEmployee() {
        // удаляем сотрудника
        assertEquals(e[1], company.removeEmployee(102));
        assertEquals(3, company.quantity()); // сотрудников стало на 1 меньше (4-1)
        assertNull(company.removeEmployee(102)); // не разрешит удалить дважды
        assertNull(company.findEmployee(102)); // вернется ноль если нету
//        company.printEmployees();
//        System.out.println(company.quantity());
//        company.findEmployee(102);
    }

    @Test
    void findEmployee() {
        // ищем сотрудника по id
        assertEquals(e[1], company.findEmployee(102));
        // ищем не существующего
        assertNull(company.findEmployee(105));
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
    }

    @Test
    void totalSalaryTest() {
        assertEquals(12100, company.totalSalary(), 0.01);

    }

    @Test
    void avgSalary() {
        assertEquals(12100.0/4, company.avgSalary(), 0.01);
    }

    @Test
    void totalSales() {
        assertEquals(55000, company.totalSales());
    }

    @Test
    void printEmployeesTest() {
        company.printEmployees();
    }

    @Test
    void findEmployeesHoursGreaterThanTest(){
        Employee[] actual = company.findEmployeesHoursGreaterThan(100);
        Employee[] expected = {e[0], e[1], e[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeesSalaryRange(){
        company.printEmployees();
        Employee[] actual = company.findEmployeesSalaryRange(2900, 6000);
        Employee[] expected = {e[0], e[2]};
        assertArrayEquals(expected, actual);
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(actual));

        return;
    }
}