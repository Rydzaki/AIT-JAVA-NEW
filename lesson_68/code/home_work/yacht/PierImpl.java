package home_work.yacht;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedMap;

public class PierImpl implements Pier{

    List <Yacht> yachtList;

    public PierImpl(List <Yacht> yachtList) {
        this.yachtList = new ArrayList <>();
    }


    @Override
    public void printAllYachts(List<Yacht> yachtList) {
        yachtList
                .forEach(System.out::println);
//        for (Yacht yacht: yachtList) {
//            System.out.println(yacht);
//        }
//        System.out.println();
    }

    @Override
    public void printBodyMaterial(List<Yacht> yachtList, String material) {
        yachtList.stream()
                .filter(yacht -> yacht.getBodyMaterial().equalsIgnoreCase(material))
                .forEach(System.out::println);
    }

    @Override
    public void printPrice(List<Yacht> yachtList, double price) {
        yachtList.stream()
                .filter(yacht -> yacht.getPrice() > price)
                .forEach(System.out::println);
    }

    @Override
    public void printAgeDiapason(List<Yacht> yachtList, int from, int to) {
        yachtList.stream()
                .filter(yacht -> yacht.getYearOfIssue() > from && yacht.getYearOfIssue() < to)
                .forEach(System.out::println);
    }

    @Override
    public void printAllYachtsReversPrice(List<Yacht> yachtList) {
        yachtList.stream()
                .sorted(Yacht::compareTo)
                .forEach(System.out::println);
    }

    @Override
    public void printAverPrice(List<Yacht> yachtList) {

        double averegePrice = yachtList.stream()
                .mapToDouble(Yacht::getPrice)
                .average()
                .orElse(0);
        System.out.println("Average price: " + averegePrice);
    }
}
