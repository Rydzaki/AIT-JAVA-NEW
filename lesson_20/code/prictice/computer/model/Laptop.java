package prictice.computer.model;

public class Laptop extends Computer1 {

    private double hours;
    private String weight;

    public Laptop(String cpu, int ram, int ssd, String brand, double hours, String weight) {
        super(cpu, ram, ssd, brand);
        this.hours = hours;
        this.weight = weight;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

//    @Override
//    public void display (){
////        System.out.println("Brand: "+ getBrand() + " CPU: "+ getCpu()+" RAM: "+
////                getRam()+ " SSD: "+ getSsd() + " Hours: "+ hours+ " Weight: "+ weight);
////        super.display(); // вызываю дисплей у родителя
////        System.out.println("Hours "+ hours+ " Weight "+ weight);
//
//        // System.out.println("Brand: "+ brand + " CPU: "+ cpu+" RAM: "+ ram+ " SSD: "+ ssd);

    @Override
    public String toString() { // переопределяем toString от родительского класса
        return super.toString() + " Hours: "+ hours+ " Weight: "+ weight;
    }
}
