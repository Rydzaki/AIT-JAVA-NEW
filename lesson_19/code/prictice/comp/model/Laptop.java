package prictice.comp.model;

public class Laptop extends Computer {

    private String display;
    private int batteryCopacity;
    private double weight;

    public Laptop(String cpu, int ram, int ssd, String brand, String display, int batteryCopacity, double weight) {
        super(cpu, ram, ssd, brand);
        this.display = display;
        this.batteryCopacity = batteryCopacity;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " Laptop{ " +
                "display='" + display + '\'' +
                ", batteryCopacity=" + batteryCopacity +
                ", weight=" + weight +
                '}';
    }
}
