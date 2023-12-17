package home_work.residents;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ResidentsAppl {
    public static void main(String[] args) {

        List <Resident> residentList = new ArrayList <>();


        residentList.add(new Resident("Ivanov", "Ivan", "male", LocalDate.of(1985, 10, 11), 1, 1));
        residentList.add(new Resident("Petrov", "Elena", "female", LocalDate.of(1990, 5, 22), 1, 1));
        residentList.add(new Resident("Sidorov", "Alex", "male", LocalDate.of(1982, 7, 3), 2, 5));
        residentList.add(new Resident("Kuznetsova", "Olga", "female", LocalDate.of(1988, 12, 15), 3, 2));
        residentList.add(new Resident("Smirnov", "Dmitry", "male", LocalDate.of(2019, 3, 28), 2, 5));
        residentList.add(new Resident("Kovalev", "Natalia", "female", LocalDate.of(1992, 8, 7), 3, 2));
        residentList.add(new Resident("Fedorova", "Sergey", "male", LocalDate.of(1980, 4, 19), 4, 3));
        residentList.add(new Resident("Antonova", "Marina", "female", LocalDate.of(1987, 11, 5), 4, 3));
        residentList.add(new Resident("Gorbachev", "Andrei", "male", LocalDate.of(1998, 6, 14), 5, 4));
        residentList.add(new Resident("Romanova", "Irina", "female", LocalDate.of(1991, 9, 26), 5, 4));
        residentList.add(new Resident("Mikhailov", "Elena", "female", LocalDate.of(1983, 2, 8), 6, 2));
        residentList.add(new Resident("Pavlov", "Vladimir", "male", LocalDate.of(1986, 1, 30), 6, 2));
        residentList.add(new Resident("Vasilyev", "Anastasia", "female", LocalDate.of(1993, 10, 2), 7, 6));
        residentList.add(new Resident("Yakovlev", "Nikolai", "male", LocalDate.of(1989, 12, 9), 7, 6));
        residentList.add(new Resident("Egorova", "Irina", "female", LocalDate.of(2016, 7, 17), 8, 7));

        ResidentsImpl residents = new ResidentsImpl(residentList);

        residents.maxResidents(residentList);
        residents.minResidents(residentList);
        residents.maxFloorResidents(residentList);
        residents.minUnderageResidents(residentList);


        //residentList.forEach(System.out::println);
    }
}
