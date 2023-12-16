package home_work.yacht;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class YachtAppl {

    public static void main(String[] args) {


        List<Yacht>yachtList = new ArrayList <>();
        PierImpl pier = new PierImpl(yachtList);

               yachtList.add(new Yacht("Eclipse", "Blohm + Voss", 2010, 162.5, "Steel", 1_500_000_000));
               yachtList.add(new Yacht("Azzam", "Lürssen", 2013, 180, "Steel", 600_000_000));
               yachtList.add(new Yacht("Dilbar", "Lürssen", 2016, 156, "Steel", 650_000_000));
               yachtList.add(new Yacht("Rising Sun", "Lürssen", 2004, 138, "Steel", 200_000_000));
               yachtList.add(new Yacht("Al Said", "Lürssen", 2008, 155, "Steel", 300_000_000));
               yachtList.add(new Yacht("Topaz", "Lürssen", 2012, 147.25, "plastic", 527_000_000));
               yachtList.add(new Yacht("Dubai", "Lürssen", 2006, 162, "plastic", 400_000_000));
               yachtList.add(new Yacht("Pelorus", "Platinum Yachts", 2003, 115, "plastic", 300_000_000));
               yachtList.add(new Yacht("Serene", "Fincantieri", 2011, 134, "wood", 330_000_000));
               yachtList.add(new Yacht("Octopus", "Lürssen", 2003, 126.2, "wood", 250_000_000));

               pier.printAllYachts(yachtList);
        System.out.println("------------------------------------------------------");
               pier.printBodyMaterial(yachtList, "WOOD");
        System.out.println("------------------------------------------------------");
               pier.printPrice(yachtList, 500_000_000);
        System.out.println("------------------------------------------------------");
               pier.printAgeDiapason(yachtList, 2000, 2005);
        System.out.println("------------------------------------------------------");
               pier.printAllYachtsReversPrice(yachtList);
        System.out.println("------------------------------------------------------");
        pier.printAverPrice(yachtList);


    }
}
