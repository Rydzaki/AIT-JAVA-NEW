package homeWork_31.marathon.computer.model;

public class Laptop extends Computer {

    private int hours;
    private double weight;


    public Laptop(int barcode, String cpu, int ram, int rom, String brand, double price, int discount, int hours, double weight) {
        super(barcode, cpu, ram, rom, brand, price, discount);
        this.hours = hours;
        this.weight = weight;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
