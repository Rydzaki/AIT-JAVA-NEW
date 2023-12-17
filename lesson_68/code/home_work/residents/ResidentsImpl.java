package home_work.residents;

import java.util.*;
import java.util.stream.Collectors;

public class ResidentsImpl implements Residents {


    List <Resident> residents;

    public ResidentsImpl(List <Resident> residents) {
        this.residents = new ArrayList <>(residents);
    }

    public List <Resident> getResidents() {
        return residents;
    }

    public void setResidents(List <Resident> residents) {
        this.residents = new ArrayList <>(residents);
    }

    @Override
    public String toString() {
        return "ResidentsImpl{" +
                "residents=" + residents +
                '}';
    }

    @Override
    public void maxResidents(List <Resident> residents) {
        Map <Integer, Long> countByApartment = residents.stream()
                .collect(Collectors.groupingBy(Resident::getApartmentNumber, Collectors.counting()));

        Optional <Map.Entry <Integer, Long>> maxEntry = countByApartment.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (maxEntry.isPresent()) {
            Integer apartmentNumber = maxEntry.get().getKey();
            Long maxValue = maxEntry.get().getValue();

            System.out.println("Максимальное количество жильцов проживает в квартире #" + apartmentNumber);
            System.out.println("Количество жильцов: " + maxValue);
        }
    }


    @Override
    public void minResidents(List <Resident> residents) {
        Map <Integer, Long> countByApartment = residents.stream()
                .collect(Collectors.groupingBy(Resident::getApartmentNumber, Collectors.counting()));

        Optional <Map.Entry <Integer, Long>> minEntry = countByApartment.entrySet().stream()
                .min(Map.Entry.comparingByValue());

        if (minEntry.isPresent()) {
            Integer apartmentNumber = minEntry.get().getKey();
            Long minValue = minEntry.get().getValue();
            System.out.println("Минимальное количество жильцов проживает в квартире #"+ apartmentNumber);
        }
    }


    @Override
    public void maxFloorResidents(List <Resident> residents) {
            Map <Integer, Long> countByApartment = residents.stream()
                    .collect(Collectors.groupingBy(Resident::getFloor, Collectors.counting()));

            Optional <Map.Entry <Integer, Long>> maxEntryFloor = countByApartment.entrySet().stream()
                    .min(Map.Entry.comparingByValue());

            if (maxEntryFloor.isPresent()) {
                Integer floorNumber = maxEntryFloor.get().getKey();
                Long minValue = maxEntryFloor.get().getValue();

                System.out.println("Минимальное количество жильцов проживает на " + floorNumber + " этаже");
            }
    }


    @Override
    public void minUnderageResidents(List <Resident> residents) {
        long minor = residents.stream()
                .filter(resident -> resident.getAge() < 18)
                .count();
        System.out.println("Колличество несовершеннолетних в доме: " + minor);

    }
}
