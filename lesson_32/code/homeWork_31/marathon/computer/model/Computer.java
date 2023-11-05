package homeWork_31.marathon.computer.model;

public abstract class Computer {

    private int barcode;
    private String cpu;
    private int ram;
    private int rom;
    private String brand;
    private double price;
    private int discount;

    public Computer(int barcode, String cpu, int ram, int rom, String brand, double price, int discount) {
        this.barcode = barcode;
        this.cpu = cpu;
        this.ram = ram;
        this.rom = rom;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Computer computer = (Computer) object;

        return barcode == computer.barcode;
    }

    @Override
    public int hashCode() {
        return barcode;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "barcode=" + barcode +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
