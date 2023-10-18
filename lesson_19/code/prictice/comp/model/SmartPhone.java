package prictice.comp.model;

public class SmartPhone extends Laptop {

    private int camera;
    private String os;

    public SmartPhone(String cpu, int ram, int ssd, String brand, String display, int batteryCopacity, double weight, int camera, String os) {
        super(cpu, ram, ssd, brand, display, batteryCopacity, weight);
        this.camera = camera;
        this.os = os;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return super.toString() + " SmartPhone{" +
                "camera=" + camera +
                ", os=" + os +
                '}';
    }
}
