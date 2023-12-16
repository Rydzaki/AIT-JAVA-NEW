package home_work.yacht;

import java.time.LocalDate;
import java.util.List;

public interface Pier {

    void printAllYachts(List <Yacht> yachtList);
    void printBodyMaterial(List<Yacht> yachtList, String material);
    void printPrice(List<Yacht> yachtList, double price);
    void printAgeDiapason(List<Yacht> yachtList, int from, int to);
    void printAllYachtsReversPrice(List<Yacht> yachtList);
    void printAverPrice(List<Yacht> yachtList);
}
