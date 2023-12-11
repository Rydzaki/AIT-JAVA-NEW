package prictice.employee_save_read;

import java.io.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SaveEmployeeAppl  {
    public static void main(String[] args) {
        Address address1 = new Address("Berlin", "Hans", 13, 3);
        Address address2 = new Address("Berlin", "Hans", 11, 1);

        Employee e1 = new Employee(1, "Peter", LocalDate.of(1996, 5, 20), 2500, address1);
        Employee e2 = new Employee(2, "Yan", LocalDate.of(1990, 1, 1), 2600, address2);

        Set <Employee> employees = new HashSet <>();
        employees.add(e1); // добавили в хешсет
        employees.add(e2);
        // делаем новый объект из класс ObjectOutputStream

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./dest/employees.dat"))) {
            oos.writeObject(employees); // отправили весь хешсет в файл

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
