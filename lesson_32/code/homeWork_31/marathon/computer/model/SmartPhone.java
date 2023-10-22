package homeWork_31.marathon.computer.model;

public class SmartPhone extends Laptop {

    private String os;
    private double screenDiagonal;
    private int camera;

    public SmartPhone(int barcode, String cpu, int ram, int rom, String brand, double price, int discount, int hours, double weight, String os, double screenDiagonal, int camera) {
        super(barcode, cpu, ram, rom, brand, price, discount, hours, weight);
        this.os = os;
        this.screenDiagonal = screenDiagonal;
        this.camera = camera;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

}
