package practice_1411.cityBus;

import java.util.Objects;

public class Bus implements Comparable<Bus> {
    // filds
    private String model;
    private String regNumber; // вместо id
    private String route; // маршрут
    private int busCapacity;

    // constructor


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(int busCapacity) {
        this.busCapacity = busCapacity;
    }

    public Bus(String model, String regNumber, String route, int busCapacity) {
        this.model = model;
        this.regNumber = regNumber;
        this.route = route;
        this.busCapacity = busCapacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", route='" + route + '\'' +
                ", busCapacity=" + busCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(regNumber, bus.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public int compareTo(Bus o) { // сортировка по маршруту и ао вместимости

        int res = this.route.compareTo(o.route); // compareTo используем потому что equals не вернет нам индекс
        //return res != 0 ? res :  this.busCapacity - o.busCapacity; // compareTo это метод для сравнения стрингов
        return res != 0 ? res :  -Integer.compare (this.busCapacity, o.busCapacity); // от большего к меньшему
    }
}
