package home_work.logistic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShipmentAppl {

    public static void main(String[] args) {

        List<Container> containers = new ArrayList<>();

        int randomConteiners = new Random().nextInt(11) + 10;

        for (int i = 0; i < randomConteiners; i++) {
            Container container = generateRandomContainer();
            containers.add(container);

        }
        printContainers(containers);
        System.out.println("============Sum total parcels====================");
        sumTotalParcel(containers);
    }

    private static void sumTotalParcel(List<Container> containers) {
         long totalParcel = containers.stream()
                .flatMap(container -> container.getPackageList().stream())
                .count();
        System.out.println("Total sum parcels: "+ totalParcel);
    }

    private static Container generateRandomContainer() {
        String containerLabel = "Label # " + (new Random().nextInt(100) + 1); // Пример маркировки контейнера
        int randomBoxes = new Random().nextInt(11) + 10;

        List<Container> boxList = new ArrayList<>();

        for (int i = 0; i < randomBoxes; i++) {
            Container box = generateRandomBox();
            boxList.add(box);
        }

        return new Container(containerLabel, boxList);
    }

    private static Container generateRandomBox() {
        //String boxLabel = "Box " + (new Random().nextInt(1000) + 1); // Пример маркировки коробки
        int randomParcels = new Random().nextInt(6) + 5;

        List<Container> parcelList = new ArrayList<>();

        for (int i = 0; i < randomParcels; i++) {
            Parcel parcel = generateRandomParcel();
            parcelList.add(new Container(parcel.toString(), null));
        }
        return new Container(null, parcelList);
    }

    private static Parcel generateRandomParcel() {
        double parcelWeight = new Random().nextDouble() * 5 + 1; // Пример веса посылки от 1 до 6 кг
        return new Parcel(parcelWeight);
    }

    private static void printContainers(List<Container> containers) {
        for (Container container : containers) {
            System.out.println(container);
            printBoxes(container.getPackageList(), 1);
        }
    }

    private static void printBoxes(List<Container> boxes, int level) {
        for (Container box : boxes) {
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(box);
            if (box.getPackageList() != null) {
                printBoxes(box.getPackageList(), level + 1);
            }
        }
    }
}
