package home_work.temperature;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TempAppl {
    public static void main(String[] args) {


        List <Temperature> temperatureList = new ArrayList <>(List.of(
                new Temperature(LocalDate.of(2020, 12, 1), 1),
                new Temperature(LocalDate.of(2020, 12, 2), -2),
                new Temperature(LocalDate.of(2020, 12, 3), -3),
                new Temperature(LocalDate.of(2020, 12, 4), -1),
                new Temperature(LocalDate.of(2020, 12, 5), -4),
                new Temperature(LocalDate.of(2020, 12, 6), 0),
                new Temperature(LocalDate.of(2020, 12, 7), -1),
                new Temperature(LocalDate.of(2020, 12, 8), 1),
                new Temperature(LocalDate.of(2020, 12, 9), -3),
                new Temperature(LocalDate.of(2020, 12, 10), 0),
                new Temperature(LocalDate.of(2020, 12, 11), 2),
                new Temperature(LocalDate.of(2020, 12, 12), -6),
                new Temperature(LocalDate.of(2020, 12, 13), -2),
                new Temperature(LocalDate.of(2020, 12, 14), 0)


        ));

        double sumTemp = temperatureList.stream()
                .filter(temperature -> temperature.getIndications() < 0)
                .mapToDouble(Temperature::getIndications)
                .count();
        LocalDate firstFrost = temperatureList.stream()
                .filter(temperature -> temperature.getIndications() < 0)
                .findFirst()
                .get().getDate();
        double maxTempetature = temperatureList.stream()
                .mapToDouble(Temperature::getIndications)
                .max()
                        .orElse(0);
        LocalDate maxTempDate = temperatureList.stream()
                        .filter(temperature -> temperature.getIndications() == maxTempetature)
                                .findFirst()
                                        .get().getDate();
        double minTempetature = temperatureList.stream()
                .mapToDouble(Temperature::getIndications)
                .min()
                .orElse(0);
        LocalDate minTempDate = temperatureList.stream()
                .filter(temperature -> temperature.getIndications() == minTempetature)
                .findFirst()
                .get().getDate();
        double averTemp = temperatureList.stream()
                        .mapToDouble(Temperature::getIndications)
                                .average()
                                        .orElse(0);
       boolean longestConsecutiveNightsBelowZero = temperatureList.stream()
               .mapToDouble(Temperature::getIndications)
               .reduce((prev, current) -> current > 0 ? 0 : prev + 1)
               .orElse(0) > 1;




        System.out.println(sumTemp);
        System.out.println(firstFrost);
        System.out.println(maxTempetature);
        System.out.println(maxTempDate);
        System.out.println(minTempetature);
        System.out.println(minTempDate);
        System.out.println(averTemp);
        System.out.println(longestConsecutiveNightsBelowZero);
    }

}