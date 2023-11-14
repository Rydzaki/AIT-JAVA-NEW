package practice_1411.company.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_1411.company.dao.Company;
import practice_1411.company.dao.CompanyImpl;
import practice_1411.company.model.Employee;
import practice_1411.company.model.Manager;
import practice_1411.company.model.SalesManager;
import practice_1411.company.model.Worker;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] employee;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        employee = new Employee[4];
        employee[0] = new Manager(101, "John", "Smith", 45, 160, 5000, 5);
        employee[1] = new SalesManager(102,"Anna", "Black", 36, 160, 25000, 0.1);
        employee[2] = new SalesManager(103,"Thomas", "White", 28, 160, 30000, 0.1);
        employee[3] = new Worker(104, "Gans", "Bauer", 30, 160, 5);

    }

    @Test
    void addEmployee() {
        //не можем добавить пустого сотрудника (NULL)
        assertFalse(company.addEmployee(null));

        // не можем добавить второй раз уже существующий

        assertFalse(company.addEmployee(employee[1]));
        Employee employee1 = new Manager(105, "Ivan", "Dugin", 55, 160, 6000, 6); // создали сотрудника
        assertTrue(company.addEmployee(employee1)); //вставляем нового сотрудника
        assertEquals(5, company.quantity());
        Employee employee2 = new Manager(106, "Piter", "Dugin", 50, 160, 6000, 6); // создали сотрудника
        assertFalse(company.addEmployee(employee2)); // не можем привысить копасити
    }

    @Test
    void removeEmployee() {
        // удаляем сотрулника
        assertEquals(employee[1], company.removeEmployee(102));
        assertEquals(3, company.quantity()); // сотрудников стало на 1 меньше (4-1)
        assertNull(company.removeEmployee(102)); // не разрешит удалить дважды
        assertNull(company.findEmployee(102)); // вернется ноль если нету
    }

    @Test
    void findEmployee() {
        // ищем сотрудника по id
        assertEquals(employee[1], company.findEmployee(102));
        // ищем не существующего
        assertNull(company.findEmployee(105));
    }

    @Test
    void quantity() {
    }

    @Test
    void totalSalary() {
    }

    @Test
    void avgSalary() {
    }

    @Test
    void totalSales() {
    }

    @Test
    void printEmployees() {
    }
}