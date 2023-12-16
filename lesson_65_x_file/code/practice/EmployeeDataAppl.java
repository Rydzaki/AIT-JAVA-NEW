package practice;

import practice_1411.soldier.model.Soidier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeeDataAppl {
    public static void main(String[] args) throws FileNotFoundException {
        // считать из файла

        try (BufferedReader br = new BufferedReader(new FileReader("employee.csv"))) {
            String str = br.readLine(); // считываем и выводим первую строку
            //System.out.println(str);
            String[] cells = str.split(",");
            printCells(cells);

            // total salary
            //total employees
            //avg salary
            //total ege
            // читаем по строкам

            double salary = 0;
            int counter = 0;
            int age = 0;
            str = br.readLine();

            while (str != null){ // делаем цикл по остальным строкам
                counter++;
                cells = str.split(",");
                salary += (Double.parseDouble(cells[2]));
                LocalDate birthday = LocalDate.parse(cells[3]);
                age += ChronoUnit.YEARS.between(birthday, LocalDate.now());
                printCells(cells);
                str = br.readLine();

            }
            System.out.println("Total sdalary: "+ salary);
            System.out.println("Total employee: " + counter);
            System.out.println("Average salary: " + salary/counter);
            System.out.println("Average age: " + age/counter);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }

    private static void printCells(String[] cells) {
        for (String s: cells) {
            System.out.print(s + " \t");
        }
        System.out.println("\n---------------------------------");
    }
}
